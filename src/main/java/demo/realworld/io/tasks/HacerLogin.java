package demo.realworld.io.tasks;


import demo.realworld.io.interactions.ExplicitWait;
import demo.realworld.io.utils.ExcelDataTable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;

import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static demo.realworld.io.userinterfaces.LoginPagina.*;
import static demo.realworld.io.userinterfaces.NuevoArticuloPagina.*;
import static demo.realworld.io.userinterfaces.PaginaPrincipal.TXT_VALIDACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HacerLogin implements Task {

    public ArrayList<Map<String, String>> dataExcel;

    private String usuario;
    private String contrasena;

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            dataExcel = ExcelDataTable.ReadData("data.xlsx", "Hoja1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                WaitUntil.the(TXT_USUARIO, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(contrasena).into(TXT_CONTRASENA),
                Click.on(BTN_INGRESAR),
                WaitUntil.the(TXT_VALIDACION, isVisible()).forNoMoreThan(10).seconds(),
                Hit.the(Keys.ENTER).keyIn(TXT_VALIDACION),
                ExplicitWait.here(5),
                WaitUntil.the(TXT_TITULO_ARTICULO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TXT_TITULO_ARTICULO),
                Enter.theValue("HOLA").into(TXT_TITULO_ARTICULO),
                Enter.theValue(dataExcel.get(0).get("clase")).into(TXT_CLASE),
                Enter.theValue(dataExcel.get(0).get("descripcion")).into(TXT_DESCRIPCION),
                Enter.theValue(dataExcel.get(0).get("etiqueta")).into(TXT_ETIQUETA),
                Click.on(BTN_PUBLICAR)

        );
    }
    public static HacerLogin en(){
        return Instrumented.instanceOf(HacerLogin.class).withProperties();
    }

    public HacerLogin usuario(String usuario){
        this.usuario = usuario;
        return this;
    }

    public HacerLogin contrasena(String contrasena){
        this.contrasena = contrasena;
        return this;
    }

}
