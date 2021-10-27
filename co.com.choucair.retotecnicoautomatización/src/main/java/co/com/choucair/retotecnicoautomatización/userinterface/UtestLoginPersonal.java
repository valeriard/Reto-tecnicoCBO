package co.com.choucair.retotecnicoautomatización.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLoginPersonal {
    public static final Target INPUT_FN = Target.the("FIRST NAME")
            .located(By.xpath("//input[contains(@name,'firstName')]"));
    public static final Target INPUT_LN = Target.the("LAST NAME")
            .located(By.xpath("//input[contains(@name,'lastName')]"));
    public static final Target INPUT_EMAIL = Target.the("EMAIL")
            .located(By.xpath("//input[contains(@name,'email')]"));
    public static final Target BUTTON_DB = Target.the("DATE OF BIRTH")
            .located(By.xpath("//select[@name='birthMonth']"));
    public static final Target BUTTON_DAY = Target.the("DAY")
            .located(By.xpath("//select[contains(@ng-model,'registrationData.birthDate.day')]"));
    public static final Target BUTTON_YEAR = Target.the("YEAR")
            .located(By.xpath("//select[contains(@ng-model,'registrationData.birthDate.year')]"));
    public static final Target BUTTON_LANGUAGE = Target.the("LANGUAGES")
            .located(By.xpath("//input[contains(@type,'search')]"));
    public static final Target BUTTON_NEXTLOCATION = Target.the("NEXT LOCATION")
            .located(By.xpath("//span[contains(.,'Next: Location')]"));
}
