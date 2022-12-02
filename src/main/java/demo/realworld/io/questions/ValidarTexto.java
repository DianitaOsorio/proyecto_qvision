package demo.realworld.io.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static demo.realworld.io.userinterfaces.PaginaPrincipal.TXT_VALIDACION;


    public class ValidarTexto implements Question<String> {

        @Override
        public String answeredBy(Actor actor) {
            return TXT_VALIDACION.resolveFor(actor).getText();
        }

        public static Question<String> valor() {
            return new demo.realworld.io.questions.ValidarTexto();
        }
    }

