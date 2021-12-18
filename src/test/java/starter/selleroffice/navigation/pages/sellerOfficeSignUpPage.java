package starter.selleroffice.navigation.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class sellerOfficeSignUpPage {

    public static Target USERNAME_FIELD = Target.the("username textbox").located(By.id("usernameInputText"));
    public static Target PASSWORD_FIELD = Target.the("password textbox").located(By.id("passwordInputText"));
    public static Target PASSWORD_CONFIRM_FIELD = Target.the("password confirm textbox").located(By.id("passwordRetypeInputText"));
    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.id("emailInputText"));
    public static Target EMAIL_CONFIRM_FIELD = Target.the("email confirm textbox").located(By.id("emailRetypeInputText"));
    public static Target SHOP_NAME_FIELD = Target.the("shop name textbox").located(By.id("nicknameInputText"));
    public static Target TERMS_AND_CONDITIONS_BTN = Target.the("terms and conditions radio button").located(By.id("nicknameInputText"));
    public static Target SIGN_UP_BTN = Target.the("sign up button").located(By.id("loginCommandButton"));

}
