package demo.realworld.io.tasks;

import demo.realworld.io.utils.ExcelDataTable;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static demo.realworld.io.userinterfaces.MiPerfilPagina.*;

public class EditarMiPerfil implements Task {

    public ArrayList<Map<String, String>> dataExcel;

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            dataExcel = ExcelDataTable.ReadData("data.xlsx", "Hoja1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        actor.attemptsTo(
                Click.on(BTN_MI_PERFIL),
                Click.on(BTN_EDITAR_PERFIL),
                Enter.theValue(dataExcel.get(0).get("descripcion")).into(TXT_MI_BIO),
                Click.on(BTN_GUARDAR)
        );
    }

    public static EditarMiPerfil enElSitio(){
        return Instrumented.instanceOf(EditarMiPerfil.class).withProperties();
    }
}
