package tasks;

import model.UtestDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.PaginaInfoPersonal;

import java.util.List;

public class Llenar implements Task {

    private List<UtestDatos> datos;

    public Llenar(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Llenar laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(Llenar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(PaginaInfoPersonal.NOMBRE),
                Enter.theValue(datos.get(0).getStrApellido()).into(PaginaInfoPersonal.APELLIDO),
                Enter.theValue(datos.get(0).getStrEmail()).into(PaginaInfoPersonal.Email),
                SelectFromOptions.byVisibleText(datos.get(0).getStrMesNacimiento()).from(PaginaInfoPersonal.MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrDiaNacimiento()).from(PaginaInfoPersonal.DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrAnoNacimiento()).from(PaginaInfoPersonal.ANO_NACIMIENTO),
                Click.on(PaginaInfoPersonal.BOTON_DIRECCION)
        );

    }
}
