package registration.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(org.openqa.selenium.By.className("unauthenticated-nav-bar__sign-up"));
}
