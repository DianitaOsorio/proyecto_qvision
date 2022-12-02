package demo.realworld.io.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)//ejecuta el informe y genera el reporte
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "demo.realworld.io/stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class LoginRunner {
}
