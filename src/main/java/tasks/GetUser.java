package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class GetUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();

    }
}
