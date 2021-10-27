package co.com.choucair.retotecnicoautomatización.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestAddress {
    public static final Target INPUT_CITY = Target.the("CITY")
            .located(By.xpath("//input[contains(@id,'city')]"));
    public static final Target INPUT_POSTAL = Target.the("POSTAL")
            .located(By.xpath("//input[contains(@ng-blur,'geocodeAddress()')]"));
    public static final Target BUTTON_COUNTRY = Target.the("COUNTRY")
            .located(By.xpath("//span[@tabindex='-1'][contains(.,'Select a country')]"));
    public static final Target BUTTON_COL = Target.the("COUNTRY")
            .located(By.xpath("//div[@ng-bind-html='country.name | highlight: $select.search'][contains(.,'Colombia')]"));
    public static final Target BUTTON_NEXDEVICE = Target.the("NEXT DEVICE")
            .located(By.xpath("//span[@aria-hidden='true'][contains(.,'Next: Devices')]"));

}
