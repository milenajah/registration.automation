package registration.automation.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestPageRegister {

    public static final Target INPUT_NAME = Target.the("Where do we write the name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Where do we write the lastname").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Where do we write the email").located(By.id("email"));
    public static final Target DROP_BIRTHMONTH =Target.the("select that shows us the field of birthmonth").located(org.openqa.selenium.By.cssSelector("select#id=birthMonth"));
    public static final Target DROP_BIRTHDAY =Target.the("select that shows us the field of birthday").located(org.openqa.selenium.By.cssSelector("select#id=birthDay"));
    public static final Target DROP_BIRTHYEAR =Target.the("select that shows us the field of birthyear").located(org.openqa.selenium.By.cssSelector("select#id=birthYear"));
    public static final Target NEXT_STEP = Target.the("button for the next step").located(org.openqa.selenium.By.className("btn btn-blue"));

}
