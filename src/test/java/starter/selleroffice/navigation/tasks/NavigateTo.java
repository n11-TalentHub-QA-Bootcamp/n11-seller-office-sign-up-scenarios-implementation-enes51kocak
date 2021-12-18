package starter.selleroffice.navigation.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.selleroffice.navigation.pages.sellerOfficeLoginPage;

public class NavigateTo {

    public static Performable sellerOfficeLoginPage() {
        return Task.where("{0} opens the seller office login page",
                Open.browserOn().the(sellerOfficeLoginPage.class));
    }

}
