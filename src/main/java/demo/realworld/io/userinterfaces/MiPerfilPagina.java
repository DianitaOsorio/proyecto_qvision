package demo.realworld.io.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MiPerfilPagina {

    public static final Target BTN_MI_PERFIL = Target.the("boton mi perfil")
            .locatedBy("//a[@class='nav-link ng-binding active']");
    public static final Target BTN_EDITAR_PERFIL = Target.the("boton editar")
            .locatedBy("//a[@class='btn btn-sm btn-outline-secondary action-btn']");
    public static final Target TXT_MI_BIO = Target.the("caja de texto")
            .locatedBy("//textarea[@class='form-control form-control-lg ng-pristine ng-valid ng-empty ng-touched']");
    public static final Target BTN_GUARDAR = Target.the("boton guardar")
            .locatedBy("//button[@type='submit']");
    public static final Target TXT_VALIDAR_BIO = Target.the("texto de bio")
            .locatedBy("//p[@ng-bind='::$ctrl.profile.bio']");


}
