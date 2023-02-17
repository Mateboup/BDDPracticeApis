package exceptions;

public class InformationUserError extends AssertionError {

  public static final String INFORMATION_USER_ERROR = "La información del usuario es errada";

  public InformationUserError(String message, Throwable cause) {
    super(message, cause);
  }
}
