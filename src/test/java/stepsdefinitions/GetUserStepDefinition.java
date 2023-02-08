package stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GetUserStepDefinition {
  @When("I send a get request with the user {int}")
  public void iSendAGetRequestWithTheUser(int arg0) {
    OnStage.setTheStage(new OnlineCast());
    theActorCalled("Edwin").whoCan(CallAnApi.at("https://reqres.in/api/users/2"));
  }

  @Then("I can see the dates of the user")
  public void iCanSeeTheDatesOfTheUser() {}
}
