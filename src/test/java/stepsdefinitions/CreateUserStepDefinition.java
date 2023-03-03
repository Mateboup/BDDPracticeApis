package stepsdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import tasks.AddInformationCreaterUserRequest;
import tasks.CreateUser;

public class CreateUserStepDefinition {

  @When("I send a get request for create user with the dates")
  public void iSendAGetRequestForCreateUserWithTheDates(Map<String, String> mapCreateUser) {
    System.out.println("FIRS STEP");
    theActorInTheSpotlight()
        .attemptsTo(
            AddInformationCreaterUserRequest.withTheData(
                mapCreateUser.get("Name"), mapCreateUser.get("Job")));
    theActorInTheSpotlight().attemptsTo(CreateUser.withTheData());
  }

  @Then("I can see the dates of the user created")
  public void iCanSeeTheDatesOfTheUserCreated() {}
}
