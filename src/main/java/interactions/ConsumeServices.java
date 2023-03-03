package interactions;

public class ConsumeServices {

  private ConsumeServices() {}

  public static ConsumeServicesPostSimple postSimple(String resources, Object request) {
    return new ConsumeServicesPostSimple(resources, request);
  }
}
