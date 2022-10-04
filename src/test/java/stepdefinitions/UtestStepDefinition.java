package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestDatos;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Responder;
import tasks.*;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^: Ricardo desea registrarse en la pagina de utest$")
    public void ricardoDeseaRegistrarseEnLaPaginaDeUtest() {
    OnStage.theActorCalled("Ricardo").wasAbleTo(Abrir.laPagina());

   }

    @When("^: cuando el usuario ingresa los datos requeridos por el sistema$")
    public void cuandoElUsuarioIngresaLosDatosRequeridosPorElSistema(List<UtestDatos> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Llenar.laPagina(datos), LlenarDireccion.laPagina(datos),
                LlenarDispositivos.laPagina(datos), LlenarFinal.laPagina(datos)
        );

    }

    @Then("^: El registro se completa al ver el boton de complete setup$")
    public void elRegistroSeCompletaAlVerElBotonDeCompleteSetup(List<UtestDatos>datos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.alos(datos)));

    }
}
