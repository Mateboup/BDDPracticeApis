package tasks;

import static net.serenitybdd.rest.SerenityRest.rest;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.rest.abilities.CallAnApi.as;
import static utils.Enums.Enums.GET_USER;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class GetUser implements Task {
  @Override
  public <T extends Actor> void performAs(T actor) {
    rest().log().all().get(as(actor).resolve(GET_USER.getValor())).then().log().all();
    /*actor.attemptsTo(Get.resource(GET_USER.getValor()));*/
    // SerenityRest.lastResponse().body().prettyPrint();
  }

  public static GetUser withTheData() {
    return instrumented(GetUser.class);
  }
}
