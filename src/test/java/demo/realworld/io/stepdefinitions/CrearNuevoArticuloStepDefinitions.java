package demo.realworld.io.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.realworld.io.questions.ValidarArticulo;
import demo.realworld.io.tasks.CrearNuevoArticulo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class CrearNuevoArticuloStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^el usuario crea un nuevo articulo con la siguiente informacion$")
    public void elUsuarioCreaUnNuevoArticuloConLaSiguienteInformacion(){
        OnStage.theActorCalled("Diana").attemptsTo(CrearNuevoArticulo.enElsitio());
    }

    @Then("^publica el articulo exitosamente$")
    public void publicaElArticuloExitosamente(String texto) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarArticulo.valor(), equalTo(texto)));
    }

}
