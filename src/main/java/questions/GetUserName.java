package questions;

import models.responseGet.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetUserName implements Question<String> {

  public static GetUserName ofTheService() {
    return new GetUserName();
  }

  @Override
  public String answeredBy(Actor actor) {
    // SerenityRest.lastResponse().body().prettyPrint();
    Response response = SerenityRest.lastResponse().body().as(Response.class);
    SerenityRest.lastResponse().body().prettyPrint();
    return response.getData().getFirst_Name();
  }
}
