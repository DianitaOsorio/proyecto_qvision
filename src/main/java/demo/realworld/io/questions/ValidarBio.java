package demo.realworld.io.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static demo.realworld.io.userinterfaces.MiPerfilPagina.TXT_VALIDAR_BIO;

public class ValidarBio implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TXT_VALIDAR_BIO.resolveFor(actor).getText();
    }

    public static Question<String> valor(){
        return new ValidarBio()
;    }
}
