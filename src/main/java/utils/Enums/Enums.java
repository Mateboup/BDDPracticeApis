package utils.Enums;

public enum Enums {
  GET_USER("/api/users/2"),
  CREATE_USER("/api/users"),
  REQUEST_CREATE_USER("Request Create User");

  private String valor;

  private Enums(String valor) {
    this.valor = valor;
  }

  public String getValor() {
    return valor;
  }
}
