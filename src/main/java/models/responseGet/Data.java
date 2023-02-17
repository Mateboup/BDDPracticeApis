package models.responseGet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Data implements Serializable {

  @JsonProperty("LastName")
  private String lastName;

  @JsonProperty("id")
  private int id;

  @JsonProperty("avatar")
  private String avatar;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("email")
  private String email;

  private static final long serialVersionUID = 2204641859228898816L;
}
