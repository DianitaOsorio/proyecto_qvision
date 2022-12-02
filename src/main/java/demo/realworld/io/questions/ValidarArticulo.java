package demo.realworld.io.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static demo.realworld.io.userinterfaces.ArticulosPagina.TXT_TITULO_VALIDACION;

public class ValidarArticulo implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TXT_TITULO_VALIDACION.resolveFor(actor).getText();
    }

    public static Question<String> valor(){
        return new ValidarArticulo();
    }
}
