package models.builders.createUserBuilder;

import models.createUser.PostCreateUser;

public final class CreateUserBuilder {

  private CreateUserBuilder() {}

  public static PostCreateUser withTheData(String name, String job) {
    return PostCreateUser.builder().name(name).job(job).build();
  }
}
