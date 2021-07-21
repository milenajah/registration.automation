package registration.automation.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import registration.automation.userinterface.AddStep;

public class CompareStep implements Task {

    public static String checkBoxs;
    private CompareStep compareStep;


    public static CompareStep theTitle() {
        return Tasks.instrumented(CompareStep.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(AddStep.SUBTITLE_PAGE));
        actor.attemptsTo(Click.on(AddStep.CHECK_BOXS));
        Click.on(AddStep.NEXT_STEP);
    }
}
