package registration.automation.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddAddress {
    public static final Target SUBTITLE_PAGE = Target.the("subtitle of the page Add your address").located(org.openqa.selenium.By.className("sub-title"));
    public static final Target NEXT_STEP = Target.the("button for the next step").located(org.openqa.selenium.By.className("btn btn-blue pull-right"));
}
