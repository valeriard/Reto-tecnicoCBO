package co.com.choucair.retotecnicoautomatización.tasks;

import co.com.choucair.retotecnicoautomatización.model.Data;
import co.com.choucair.retotecnicoautomatización.userinterface.UtestAddress;
import co.com.choucair.retotecnicoautomatización.userinterface.UtestComplete;
import co.com.choucair.retotecnicoautomatización.userinterface.UtestDevice;
import co.com.choucair.retotecnicoautomatización.userinterface.UtestLoginPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

public class Register implements Task {

    private List<Data> dataUSer;

    public Register(List<Data> dataUSer) {
        this.dataUSer = dataUSer;
    }

    public static Register theUser(List<Data> dataUser) {
        return Tasks.instrumented(Register.class,dataUser);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Enter.theValue(dataUSer.get(0).getFirstname()).into(UtestLoginPersonal.INPUT_FN),
                    Enter.theValue(dataUSer.get(0).getLastname()).into(UtestLoginPersonal.INPUT_LN),
                    Enter.theValue(dataUSer.get(0).getEmail()).into(UtestLoginPersonal.INPUT_EMAIL),
                    SelectFromOptions.byVisibleText("August").from(UtestLoginPersonal.BUTTON_DB),
                    SelectFromOptions.byVisibleText("7").from(UtestLoginPersonal.BUTTON_DAY),
                    SelectFromOptions.byVisibleText("1993").from(UtestLoginPersonal.BUTTON_YEAR),
                    Click.on(UtestLoginPersonal.BUTTON_LANGUAGE),
                    Enter.theValue(dataUSer.get(0).getLanguages()).into(UtestLoginPersonal.BUTTON_LANGUAGE).thenHit(Keys.ENTER),
                    Click.on(UtestLoginPersonal.BUTTON_NEXTLOCATION),
                    Click.on(UtestAddress.INPUT_CITY),
                    Enter.theValue(dataUSer.get(0).getCity()).into(UtestAddress.INPUT_CITY),
                    Hit.the(Keys.ARROW_DOWN).keyIn(UtestAddress.INPUT_CITY),
                    Click.on(UtestAddress.INPUT_POSTAL),
                    Enter.theValue(dataUSer.get(0).getPostal()).into(UtestAddress.INPUT_POSTAL),
                    Click.on(UtestAddress.BUTTON_COUNTRY),
                    MoveMouse.to(UtestAddress.BUTTON_COL).andThen(actions -> actions.click()),
                    Click.on(UtestAddress.BUTTON_NEXDEVICE),
                    Click.on(UtestDevice.BUTTON_YCPT),
                    MoveMouse.to(UtestDevice.BUTTON_WINDOWS).andThen(actions -> actions.click()),
                    Click.on(UtestDevice.BUTTON_VERSION),
                    MoveMouse.to(UtestDevice.BUTTON_VESIONIN).andThen(actions -> actions.click()),
                    Click.on(UtestDevice.BUTTON_LANGUAGUE2),
                    MoveMouse.to(UtestDevice.BUTTON_LANGUAGUESPANISH).andThen(actions -> actions.click()),
                    Click.on(UtestDevice.BUTTON_MOBILE),
                    MoveMouse.to(UtestDevice.BUTTON_MOBILEHW).andThen(actions -> actions.click()),
                    Click.on(UtestDevice.BUTTON_MODEL),
                    Enter.theValue(dataUSer.get(0).getModel()).into(UtestDevice.BUTTON_MODELCLICK).thenHit(Keys.ENTER),
                    Click.on(UtestDevice.BUTTON_OPSYSCLICK),
                    Enter.theValue(dataUSer.get(0).getSyos()).into(UtestDevice.BUTTON_OPSYSCLICKIOS).thenHit(Keys.ENTER),
                    Click.on(UtestDevice.BUTTON_NEXTLASTSTEP),
                    Click.on(UtestComplete.BUTTON_PASSWORD),
                    Enter.theValue(dataUSer.get(0).getPassword()).into(UtestComplete.BUTTON_PASSWORD),
                    Click.on(UtestComplete.BUTTON_PASSWORD_CONFIRM),
                    Enter.theValue(dataUSer.get(0).getPassword()).into(UtestComplete.BUTTON_PASSWORD_CONFIRM),
                    Click.on(UtestComplete.CLICK_ACCEPT_TERMS),
                    Click.on(UtestComplete.CLICK_PRIVACY_SECURITY),
                    Click.on(UtestComplete.BUTTON_COMPLETE)

                    );

    }
}
