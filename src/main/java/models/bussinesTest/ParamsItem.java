package models.bussinesTest;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "mainPolicyNumber",
  "module",
  "declaredAmount",
  "operationType",
  "idCustom",
  "riskPolicyNumber",
  "startDate",
  "riskIdentification"
})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Data
public class ParamsItem {

  @JsonProperty("mainPolicyNumber")
  private String mainPolicyNumber;

  @JsonProperty("module")
  private String module;

  @JsonProperty("declaredAmount")
  private int declaredAmount;

  @JsonProperty("operationType")
  private String operationType;

  @JsonProperty("idCustom")
  private String idCustom;

  @JsonProperty("riskPolicyNumber")
  private String riskPolicyNumber;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("riskIdentification")
  private String riskIdentification;

  private static final long serialVersionUID = -2937922619932336624L;
}
