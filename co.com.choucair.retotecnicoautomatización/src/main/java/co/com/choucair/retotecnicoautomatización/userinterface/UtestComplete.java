package co.com.choucair.retotecnicoautomatización.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestComplete {
    public static final Target BUTTON_PASSWORD = Target.the("CLICK PASSWORD")
            .located(By.xpath("//input[contains(@name,'password')]"));
    public static final Target BUTTON_PASSWORD_CONFIRM = Target.the("CONFIRM PASSWORD_CONFIRM")
            .located(By.xpath("//input[contains(@name,'confirmPassword')]"));
    public static final Target CLICK_ACCEPT_TERMS = Target.the("CLICK ACCEPT")
            .located(By.xpath("//span[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]"));
    public static final Target CLICK_PRIVACY_SECURITY = Target.the("CLICK PRIVACY")
            .located(By.xpath("//span[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));
    public static final Target BUTTON_COMPLETE = Target.the("COMPLETE SETUP")
            .located(By.xpath("//a[contains(@aria-label,'Complete Setup')]"));
    public static final Target BUTTON_LOGIN = Target.the("SIGN IN")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__link']"));
}
