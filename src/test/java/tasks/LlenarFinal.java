package tasks;

import model.UtestDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.PaginaFinal;

import java.util.List;

public class LlenarFinal implements Task {

    private List<UtestDatos>datos;

    public LlenarFinal(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarFinal laPagina(List<UtestDatos>datos) {
        return Tasks.instrumented(LlenarFinal.class,datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datos.get(0).getStrClave()).into(PaginaFinal.CLAVE),
                Enter.theValue(datos.get(0).getStrClave()).into(PaginaFinal.CONFIRMAR_CLAVE),
                Click.on(PaginaFinal.CHECKBOX_01),
                Click.on(PaginaFinal.CHECKBOX_02),
                Click.on(PaginaFinal.CHECKBOX_03),
                Click.on(PaginaFinal.BOTON_FINAL)

        );

    }
}
