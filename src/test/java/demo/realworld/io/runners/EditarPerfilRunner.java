package demo.realworld.io.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/crearNuevoArticulo.feature",
        glue = "demo.realworld.io/stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class EditarPerfilRunner {
}
