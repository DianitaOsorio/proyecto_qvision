package demo.realworld.io.tasks;

import demo.realworld.io.utils.ExcelDataTable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static demo.realworld.io.userinterfaces.NuevoArticuloPagina.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CrearNuevoArticulo implements Task {

    public ArrayList<Map<String, String>> dataExcel;

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static CrearNuevoArticulo enElsitio() {
        return Instrumented.instanceOf(CrearNuevoArticulo.class).withProperties();
    }

}
