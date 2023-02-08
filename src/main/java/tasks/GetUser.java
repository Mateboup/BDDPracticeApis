package tasks;

import static net.serenitybdd.rest.SerenityRest.rest;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class GetUser implements Task {
  @Override
  public <T extends Actor> void performAs(T actor) {
    rest().log().all().get(as(actor).resolve("/api/users/2")).then().log().all();
    // actor.attemptsTo(Get.resource("/api/users/2"));
    //SerenityRest.lastResponse().body().prettyPrint();
  }

  public static GetUser withTheData() {
    return instrumented(GetUser.class);
  }
}
