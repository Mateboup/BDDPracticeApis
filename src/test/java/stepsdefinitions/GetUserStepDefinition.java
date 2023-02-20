package stepsdefinitions;

import static exceptions.CodeResponseServiceError.CODE_RESPONSE_ERROR;
import static exceptions.InformationUserError.INFORMATION_USER_ERROR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import exceptions.CodeResponseServiceError;
import exceptions.InformationUserError;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Map;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.apache.http.HttpStatus;
import questions.CodeResponserService;
import questions.GetUserName;
import tasks.GetUser;

public class GetUserStepDefinition {
  @When("I send a get request with the user {string}")
  public void iSendAGetRequestWithTheUser(String arg0) {
    OnStage.setTheStage(new OnlineCast());
    theActorCalled("SAM").whoCan(CallAnApi.at("https://reqres.in"));
    theActorInTheSpotlight().attemptsTo(GetUser.withTheData());
  }

  @Then("I can see the dates of the user")
  public void iCanSeeTheDatesOfTheUser(Map<String, String> mapFeatures) {
    theActorInTheSpotlight().remember("mapFeatures", mapFeatures);
    theActorInTheSpotlight()
        .should(
            seeThat(CodeResponserService.get(), equalTo(HttpStatus.SC_OK))
                .orComplainWith(CodeResponseServiceError.class, CODE_RESPONSE_ERROR));

    theActorInTheSpotlight()
        .should(
            seeThat(GetUserName.ofTheService(), equalTo(mapFeatures.get("First Name")))
                .orComplainWith(InformationUserError.class, INFORMATION_USER_ERROR));
  }
}
