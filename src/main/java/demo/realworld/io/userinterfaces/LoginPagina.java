package demo.realworld.io.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPagina {

    public  static  final Target TXT_USUARIO = Target.the("campo usuario").locatedBy("//input[@placeholder='Email']");
    public  static  final Target TXT_CONTRASENA = Target.the("campo contrasena").locatedBy("//input[@placeholder='Password']");
    public  static  final Target  BTN_INGRESAR = Target.the("boton ingresar").locatedBy("//button[@type='submit']");
}