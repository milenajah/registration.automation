package registration.automation.userinterface;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AddStep {
    public static final Target SUBTITLE_PAGE = Target.the("subtitle of the page Tell us about your devices").located(org.openqa.selenium.By.className("sub-title"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the name").located(By.id("firstName"));
    public static final Target INPUT_CONFIRMPASSWORD = Target.the("Where do we write the lastname").located(By.id("lastName"));
    public static  final Target CHECK_BOXS = Target.the("checkboxs").located(org.openqa.selenium.By.className("checkmark signup-consent__checkbox error"));
    public static final Target NEXT_STEP = Target.the("button for the next step").located(org.openqa.selenium.By.className("btn btn-blue "));
}

