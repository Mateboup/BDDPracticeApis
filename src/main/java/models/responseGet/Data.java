package models.responseGet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"last_Name", "id", "avatar", "first_Name", "email"})
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Builder
public class Data implements Serializable {

  @JsonProperty("last_Name")
  private String last_Name;

  @JsonProperty("id")
  private int id;

  @JsonProperty("avatar")
  private String avatar;

  @JsonProperty("first_Name")
  private String first_Name;

  @JsonProperty("email")
  private String email;

  private static final long serialVersionUID = 2204641859228898816L;
}
