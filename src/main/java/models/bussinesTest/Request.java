package models.bussinesTest;

import java.util.List;
import lombok.Data;

@Data
public class Request {
  private String productLine;
  private String volume;
  private String method;
  private String name;
  private String id;
  private List<ParamsItem> params;
  private String jsonrpc;
  private String riskId;
}
