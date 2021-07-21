package registration.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import registration.automation.userinterface.AddDevice;

public class CompareDevice implements Task {

            private CompareDevice compareDevice;
            public static CompareDevice theTitle() {
                return Tasks.instrumented(CompareDevice.class);
            }


            @Override
            public <T extends Actor> void performAs(T actor){



                actor.attemptsTo(Click.on(AddDevice.SUBTITLE_PAGE));
                Click.on(AddDevice.NEXT_STEP);

            }

        }

