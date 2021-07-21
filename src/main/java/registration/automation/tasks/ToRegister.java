package registration.automation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import registration.automation.userinterface.UtestPageRegister;



public class ToRegister implements Task {
    private String strName;
    private String strLastName;
    private String strEmailAddress;




    public ToRegister(String strName, String strLastName, String strEmailAddress) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;



    }


    public static ToRegister onThePage(String strName, String strLastName, String strEmailAddress, String strBirthMonth, String strBirthDay, String strBirthYear ) {
        return Tasks.instrumented(ToRegister.class, strName, strLastName, strEmailAddress, strBirthMonth, strBirthDay, strBirthYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestPageRegister.INPUT_NAME),
                Enter.theValue(strName).into(UtestPageRegister.INPUT_NAME),
                Enter.theValue(strLastName).into(UtestPageRegister.INPUT_LASTNAME),
                Enter.theValue(strEmailAddress).into(UtestPageRegister.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("June").from(UtestPageRegister.DROP_BIRTHMONTH),
                SelectFromOptions.byValue("number:28").from(UtestPageRegister.DROP_BIRTHDAY),
                SelectFromOptions.byValue("number:1991").from(UtestPageRegister.DROP_BIRTHYEAR),


                Click.on(UtestPageRegister.NEXT_STEP));
}
}
