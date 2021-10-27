package co.com.choucair.retotecnicoautomatización.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestDevice {
    public static final Target BUTTON_YCPT = Target.the("YOUR COMPUTER")
            .located(By.xpath("(//i[contains(@class,'caret pull-right')])[1]"));
    public static final Target BUTTON_WINDOWS = Target.the("YOUR COMPUTER WINDOWS")
            .located(By.xpath("//div[@ng-bind-html='device.name | highlight: $select.search'][contains(.,'Windows')]"));
    public static final Target BUTTON_VERSION = Target.the("VERSION")
            .located(By.xpath("(//i[contains(@class,'caret pull-right')])[2]"));
    public static final Target BUTTON_VESIONIN = Target.the("VERSION 10")
            .located(By.xpath("(//div[@ng-bind-html='version.name | highlight: $select.search'][contains(.,'10')])[2]"));
    public static final Target BUTTON_LANGUAGUE2 = Target.the("LANGUAGE2")
            .located(By.xpath("(//i[contains(@class,'caret pull-right')])[3]"));
    public static final Target BUTTON_LANGUAGUESPANISH = Target.the("LANGUAGE2 SPANISH")
            .located(By.xpath("//div[@ng-bind-html='language.name | highlight: $select.search'][contains(.,'Spanish')]"));
    public static final Target BUTTON_MOBILE = Target.the("YOUR MOBILE DEVICE")
            .located(By.xpath("(//i[contains(@class,'caret pull-right')])[4]"));
    public static final Target BUTTON_MOBILEHW = Target.the("YOUR MOBILE DEVICE iPhone")
            .located(By.xpath("//div[@ng-bind-html='device.name | highlight: $select.search'][contains(.,'Apple')]"));
    public static final Target BUTTON_MODEL = Target.the("MODEL")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div[1]/span[1]/span[1]"));
    public static final Target BUTTON_MODELCLICK = Target.the("MODEL 4")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/input[1]"));
    public static final Target BUTTON_OPSYSCLICK = Target.the("CLICK EN OPSYS")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div[1]/span[1]/span[1]"));
    public static final Target BUTTON_OPSYSCLICKIOS = Target.the("CLICK EN IOS")
            .located(By.xpath("/html[1]/body[1]/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/input[1]"));
    public static final Target BUTTON_NEXTLASTSTEP = Target.the("NEXT DEVICE")
            .located(By.xpath("//span[contains(.,'Next: Last Step')]"));

}
