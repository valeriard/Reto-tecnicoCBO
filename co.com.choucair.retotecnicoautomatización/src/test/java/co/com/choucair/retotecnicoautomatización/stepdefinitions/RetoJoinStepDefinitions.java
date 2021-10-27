package co.com.choucair.retotecnicoautomatización.stepdefinitions;

import co.com.choucair.retotecnicoautomatización.model.Data;
import co.com.choucair.retotecnicoautomatización.questions.Answer;
import co.com.choucair.retotecnicoautomatización.tasks.OpenUp;
import co.com.choucair.retotecnicoautomatización.tasks.Register;
import co.com.choucair.retotecnicoautomatización.tasks.SingIn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RetoJoinStepDefinitions {
    @Before
    public void initialConfiguration(){
        setTheStage(new OnlineCast());
    }

    @Given("^Valeria going to create a new user$")
    public void valeriaGoingToCreateANewUser(List<Data> dataUser) {
        theActorCalled("Valeria").wasAbleTo(OpenUp.thePage(), Register.theUser(dataUser));
    }

    @When("^Valeria going to into sign in$")
    public void valeriaGoingToIntoSignIn(List<Data> dataUser) {
        theActorInTheSpotlight().attemptsTo(SingIn.theUser(dataUser));
    }

    @Then("^Valeria going to  verify her account$")
    public void valeriaGoingToVerifyHerAccount(List<Data> dataUser) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(dataUser.get(0).getEmail())));
    }
}
