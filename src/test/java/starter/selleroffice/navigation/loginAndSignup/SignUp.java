package starter.selleroffice.navigation.loginAndSignup;

import lombok.SneakyThrows;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClickOnElement;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.selleroffice.navigation.pages.sellerOfficeLoginPage;
import starter.selleroffice.navigation.pages.sellerOfficeSignUpPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SignUp implements Task {

    private final String username;
    private final String password;
    private final String email;
    private final String shopName;

    SignUp(String username, String password, String email, String shopName) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.shopName = shopName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(sellerOfficeSignUpPage.USERNAME_FIELD),
                SendKeys.of(this.username).into(sellerOfficeSignUpPage.USERNAME_FIELD),
                Click.on(sellerOfficeSignUpPage.PASSWORD_FIELD),
                SendKeys.of(this.password).into(sellerOfficeSignUpPage.PASSWORD_FIELD),
                Click.on(sellerOfficeSignUpPage.PASSWORD_CONFIRM_FIELD),
                SendKeys.of(this.password).into(sellerOfficeSignUpPage.PASSWORD_CONFIRM_FIELD),
                Click.on(sellerOfficeSignUpPage.EMAIL_FIELD),
                SendKeys.of(this.email).into(sellerOfficeSignUpPage.EMAIL_FIELD),
                Click.on(sellerOfficeSignUpPage.EMAIL_CONFIRM_FIELD),
                SendKeys.of(this.email).into(sellerOfficeSignUpPage.EMAIL_CONFIRM_FIELD),
                Click.on(sellerOfficeSignUpPage.SHOP_NAME_FIELD),
                SendKeys.of(this.shopName).into(sellerOfficeSignUpPage.SHOP_NAME_FIELD),
                Click.on(sellerOfficeSignUpPage.SIGN_UP_BTN),
                Click.on(sellerOfficeSignUpPage.SIGN_UP_BTN) //works with double click
        );
    }

    public static SignUp signUpTheSystem(String username_text, String password_text, String email_text, String shopname_txt) {
        return instrumented(SignUp.class ,username_text,password_text, email_text, shopname_txt);
    }

}
