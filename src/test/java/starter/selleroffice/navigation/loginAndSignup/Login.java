package starter.selleroffice.navigation.loginAndSignup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import starter.selleroffice.navigation.pages.sellerOfficeLoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final String username_text;
    private final String password_text;

    Login(String email_text, String password_text) {
        this.username_text = email_text;
        this.password_text = password_text;
    }

    @Step("{0} Login with email '#username_text' and password '#password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SendKeys.of(this.username_text).into(sellerOfficeLoginPage.USERNAME_FIELD),
                SendKeys.of(this.password_text).into(sellerOfficeLoginPage.PASSWORD_FIELD),
                Click.on(sellerOfficeLoginPage.LOGIN_BTN)
        );
    }


    public static Login asNewUser(String username_text, String password_text) {
        return instrumented(Login.class ,username_text,password_text);
    }
}
