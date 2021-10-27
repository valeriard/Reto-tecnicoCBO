package co.com.choucair.retotecnicoautomatización.tasks;

import co.com.choucair.retotecnicoautomatización.model.Data;
import co.com.choucair.retotecnicoautomatización.userinterface.SingInAccount;
import co.com.choucair.retotecnicoautomatización.userinterface.UtestComplete;
import co.com.choucair.retotecnicoautomatización.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class SingIn  implements Task {
    private List<Data> dataUser;

    public SingIn(List<Data> dataUser) {
        this.dataUser = dataUser;
    }

    public static SingIn theUser(List<Data> dataUser) {
        return Tasks.instrumented(SingIn.class,dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestComplete.BUTTON_LOGIN),
                Click.on(SingInAccount.BUTTON_PASSWORD),
                Enter.theValue(dataUser.get(0).getEmail()).into(SingInAccount.BUTTON_EMAILADDRESS),
                Click.on(SingInAccount.BUTTON_PASSWORD),
                Enter.theValue(dataUser.get(0).getPassword()).into(SingInAccount.BUTTON_PASSWORD),
                Click.on(SingInAccount.BUTTON_SIGIN)
                );
    }
}
