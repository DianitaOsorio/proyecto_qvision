package demo.realworld.io.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.realworld.io.drivers.DriverRemoteBrowser;
import demo.realworld.io.models.ListaUsuario;
import demo.realworld.io.questions.ValidarTexto;
import demo.realworld.io.tasks.HacerLogin;
import demo.realworld.io.utils.GlobalData;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

public class LoginStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^que el usuario ingrese a la pagina$")
    public void queElUsuarioIngreseALaPagina() {
        DriverRemoteBrowser.iniciaConEstasOpciones();
        OnStage.theActorCalled("Diana").can(BrowseTheWeb.with(DriverRemoteBrowser.en(GlobalData.URL)));

    }

    @When("^ingresa los datos de acceso$")
    public void ingresaLosDatosDeAcceso(List<ListaUsuario> listaUsuarioList) {
        OnStage.theActorInTheSpotlight().attemptsTo(HacerLogin.en()
                .usuario(listaUsuarioList.get(0).getUsuario())
                .contrasena(listaUsuarioList.get(0).getContrasena())
        );

    }

    @Then("^valida que inicio sesion exitosamente (.*)$")
    public void validaQueInicioSesionExitosamente(String texto) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidarTexto.valor(), containsString(texto)));

    }
}


