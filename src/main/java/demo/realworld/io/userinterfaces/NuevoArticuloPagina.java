package demo.realworld.io.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NuevoArticuloPagina {

    public static final Target TXT_TITULO_ARTICULO = Target.the("titulo articulo")
            .locatedBy("//input[@placeholder='Article Title']");
    public static final Target TXT_CLASE = Target.the("clase")
            .locatedBy("//input[@ng-model='$ctrl.article.description']");
    public static final Target TXT_DESCRIPCION = Target.the("descripcion")
            .locatedBy("//fieldset//textarea");
    public static final Target TXT_ETIQUETA = Target.the("etiqueta")
            .locatedBy("//input[@placeholder='Enter tags']");
    public static final Target BTN_PUBLICAR = Target.the("boton")
            .locatedBy("//button[@class='btn btn-lg pull-xs-right btn-primary']");
}
