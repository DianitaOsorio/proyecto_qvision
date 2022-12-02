package demo.realworld.io.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ArticulosPagina {
    public static final Target TXT_TITULO_VALIDACION = Target.the("titulo a validar")
            .locatedBy("//h1[@class='ng-binding']");
}
