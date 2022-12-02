package demo.realworld.io.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.realworld.io.models.MiDescripcion;
import demo.realworld.io.questions.ValidarBio;
import demo.realworld.io.tasks.EditarMiPerfil;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class EditarPerfilStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^el usuario edita el bio de su perfil$")
    public void elUsuarioEditaElBioDeSuPerfil() {
        OnStage.theActorInTheSpotlight().attemptsTo(EditarMiPerfil.enElSitio());
    }

    @Then("^podra modificar su informacion correctamente$")
    public void podraModificarSuInformacionCorrectamente(String texto) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarBio.valor(), equalTo(texto)));

    }
}
