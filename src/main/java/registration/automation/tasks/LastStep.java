package registration.automation.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import registration.automation.userinterface.AddStep;
import registration.automation.userinterface.UtestPageRegister;

public class LastStep implements Task {

    private String strPassword;
    private String strConfirmPassword;


    public LastStep (String strPassword, String strConfirmPassword) {
            this.strPassword = strPassword;
            this.strConfirmPassword = strConfirmPassword;

    }


    public static LastStep onThePage(String strPassword, String strConfirmPassword) {
        return Tasks.instrumented((LastStep.class), strPassword, strConfirmPassword);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AddStep.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(AddStep.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(AddStep.INPUT_CONFIRMPASSWORD),

                Click.on(UtestPageRegister.NEXT_STEP));
}
}
