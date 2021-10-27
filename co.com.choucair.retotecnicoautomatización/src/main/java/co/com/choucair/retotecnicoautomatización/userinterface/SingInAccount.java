package co.com.choucair.retotecnicoautomatización.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SingInAccount {
    public static final Target BUTTON_EMAILADDRESS= Target.the("EMAIL ADDRESS")
            .located(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/main[1]/section[1]/div[1]/input[1]"));
    public static final Target BUTTON_PASSWORD= Target.the(" ENTER PASSWORD")
            .located(By.xpath("//input[contains(@name,'password')]"));
    public static final Target BUTTON_SIGIN= Target.the("SIGN IN")
            .located(By.xpath("//button[@class='btn'][contains(.,'Sign in')]"));
    public static final Target BUTTON_VERIFY= Target.the("VERIFY")
            .located(By.xpath("//span[contains(.,'')]"));
}

