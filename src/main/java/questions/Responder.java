package questions;

import model.UtestDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.PaginaFinal;

import java.util.List;

public class Responder implements Question<Boolean> {

 private List<UtestDatos>datos;

    public Responder(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Responder alos(List<UtestDatos> datos) {
        return new Responder(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Boton_Final = Text.of(PaginaFinal.BOTON_FINAL).viewedBy(actor).asString();
        return datos.get(0).getStrTextoFinal().equals(Boton_Final);
    }
}
