package demo.realworld.io.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaPrincipal {

    public static final Target TXT_VALIDACION = Target.the("enlace hacia crear nuevo articulo")
            .locatedBy("//a[@href='#/editor/']");

}
