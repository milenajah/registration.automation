package registration.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import registration.automation.userinterface.AddAddress;



public class Compare implements Task {

    private Compare compare;
    public static Compare theTitle() {
        return Tasks.instrumented(Compare.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor){



        actor.attemptsTo(Click.on(AddAddress.SUBTITLE_PAGE));
        Click.on(AddAddress.NEXT_STEP);

    }

    }

