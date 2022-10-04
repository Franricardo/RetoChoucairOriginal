package tasks;

import model.UtestDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.PaginaDireccion;

import java.util.List;

public class LlenarDireccion implements Task {

    private List<UtestDatos> datos;

    public LlenarDireccion(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarDireccion laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarDireccion.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrCiudad()).into(PaginaDireccion.CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(PaginaDireccion.CIUDAD),
                Hit.the(Keys.ENTER).into(PaginaDireccion.CIUDAD),
                Enter.theValue(datos.get(0).getStrZip()).into(PaginaDireccion.ZIP),
                Click.on(PaginaDireccion.CONTENEDOR_PAIS),
                Enter.theValue(datos.get(0).getStrPais()).into(PaginaDireccion.PAIS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(PaginaDireccion.BOTON_DISPOSITIVOS)

        );

    }
}
