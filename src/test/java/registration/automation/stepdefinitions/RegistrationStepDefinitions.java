package registration.automation.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import registration.automation.model.UtestData;
import registration.automation.tasks.*;
import registration.automation.userinterface.AddAddress;
import registration.automation.userinterface.AddDevice;

import java.util.List;


public class RegistrationStepDefinitions {

    @Before
    public void setStage () {

        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^than milena registers on the utest page$")
    public void thanMilenaRegistersOnTheUtestPage()  {
       OnStage.theActorCalled("Milena").wasAbleTo(OpenUp.thePage());

    }

    @When("^she enter personal data$")
    public void sheEnterPersonalData(List<UtestData>utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(ToRegister.onThePage(utestData.get(0).getStrName(), utestData.get(0).getStrLastName(), utestData.get(0).getStrEmailAddress(), utestData.get(0).getStrBirthMonth(), utestData.get(0).getStrBirthDay(), utestData.get(0).getStrBirthYear()));
        {

        }}@Given("^than Milena visualizes the title add your address$")
    public void thanMilenaVisualizesTheTitleAddYourAddress()  {
        OnStage.theActorCalled("Milena").attemptsTo(Compare.theTitle());

    }
    //since the system automatically brings the data
    @When("^she enter your location$")
    public void sheEnterYourLocation() {
        OnStage.theActor("milena").attemptsTo(Click.on(AddAddress.NEXT_STEP)); {
        }
    }
    @Given("^than Milena visualizes the title tell us about your device$")
    public void thanMilenaVisualizesTheTitleTellUsAboutYourDevice() {
        OnStage.theActorCalled("Milena").attemptsTo(CompareDevice.theTitle());
    }
    //since the system automatically brings the data
    @When("^she enter your device data$")
    public void sheEnterYourDeviceData() {
        OnStage.theActor("milena").attemptsTo(Click.on(AddDevice.NEXT_STEP));
    }

    @Given("^than Milena visualizes the title The last step$")
    public void thanMilenaVisualizesTheTitleTheLastStep() {
        OnStage.theActorCalled("Milena").attemptsTo(CompareStep.theTitle());
    }

    @When("^entering your password information$")
    public void enteringYourPasswordInformation(List<UtestData>utestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(LastStep.onThePage(utestData.get(0).getStrPassword(), utestData.get(0).getStrConfirmPassword()));
        {
        }

    }

    @Then("^accept the terms of use and privacy$")
    public void acceptTheTermsOfUseAndPrivacy() {
        OnStage.theActor("milena").attemptsTo(Click.on(CompareStep.checkBoxs));
    }
    }
