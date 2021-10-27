package co.com.choucair.retotecnicoautomatización.questions;

import co.com.choucair.retotecnicoautomatización.userinterface.SingInAccount;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String SignEmail = Text.of(SingInAccount.BUTTON_VERIFY).viewedBy(actor).asString();
        if(question.equals(SignEmail)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
