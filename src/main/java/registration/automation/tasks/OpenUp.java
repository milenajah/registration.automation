package registration.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import registration.automation.userinterface.UtestPage;

public class OpenUp implements Task {

    private UtestPage utestPage;

    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){


        actor.attemptsTo(Open.browserOn(utestPage));
        actor.attemptsTo(Click.on(UtestPage.LOGIN_BUTTON));

    }
}
