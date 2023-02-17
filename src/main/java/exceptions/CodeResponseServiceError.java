package exceptions;

public class CodeResponseServiceError extends AssertionError {

  public static final String CODE_RESPONSE_ERROR =
      "El código de respuesta obtenido no es igual al esperado";

  public CodeResponseServiceError(String message, Throwable cause) {
    super(message, cause);
  }
}
