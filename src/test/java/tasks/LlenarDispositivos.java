package tasks;

import model.UtestDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterface.Paginadispositivos;

import java.util.List;

public class LlenarDispositivos implements Task {

    private List<UtestDatos> datos;

    public LlenarDispositivos(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarDispositivos laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo((Click.on(Paginadispositivos.CONTENEDOR_DISPOSITIVO_MOVIL)),
                Enter.theValue(datos.get(0).getStrDispositivoMovil()).into(Paginadispositivos.DISPOSITIVO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Paginadispositivos.CONTENEDOR_MODELO_MOVIL),
                Enter.theValue(datos.get(0).getStrModeloMovil()).into(Paginadispositivos.MODELO_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Paginadispositivos.CONTENEDOR_SISTEMA_OPERATIVO),
        Enter.theValue(datos.get(0).getStrSistemaOperativoMovil()).into(Paginadispositivos.SISTEMA_OPERATIVO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(Paginadispositivos.BOTON_FINAL)

                );

    }
}
