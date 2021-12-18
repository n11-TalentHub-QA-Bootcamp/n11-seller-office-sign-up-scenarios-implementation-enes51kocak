package starter.selleroffice.navigation.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://so.n11.com/")
public class sellerOfficeLoginPage extends PageObject {

    public static Target USERNAME_FIELD = Target.the("email textbox").located(By.id("j_username"));
    public static Target PASSWORD_FIELD = Target.the("password textbox").located(By.id("j_password"));
    public static Target LOGIN_BTN = Target.the("login button").located(By.id("j_id45_j_id_2f"));
    public static Target SIGN_UP_BTN = Target.the("sign up button").located(By.id("registerNow"));

}
