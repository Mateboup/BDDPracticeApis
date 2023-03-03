package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static utils.Enums.Enums.REQUEST_CREATE_USER;

import lombok.AllArgsConstructor;
import models.builders.createUserBuilder.CreateUserBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class AddInformationCreaterUserRequest implements Task {

  private final String name;
  private final String job;

  public static Performable withTheData(String name, String job) {
    return instrumented(AddInformationCreaterUserRequest.class, name, job);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.remember(REQUEST_CREATE_USER.getValor(), CreateUserBuilder.withTheData(name, job));
  }
}
