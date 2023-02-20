package models.responseGet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"data", "support"})
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Builder
public class Response {

  @JsonProperty("data")
  private Data data;

  @JsonProperty("support")
  private Support support;
}
