package questions;

import models.responseGet.Data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetUserName implements Question<String> {

    public static GetUserName ofTheService(){ return new GetUserName();}

    @Override
    public String answeredBy(Actor actor) {
        Data data =
        return null;
    }
}
