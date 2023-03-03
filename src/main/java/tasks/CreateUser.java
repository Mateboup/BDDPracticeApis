package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static utils.Enums.Enums.*;

import interactions.ConsumeServices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class CreateUser implements Task {

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        ConsumeServices.postSimple(
            CREATE_USER.getValor(), actor.recall(REQUEST_CREATE_USER.getValor())));
  }

  public static Performable withTheData() {
    return instrumented(CreateUser.class);
  }
}
