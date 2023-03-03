package models.createUser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({"name", "job"})
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Data
public class PostCreateUser implements Serializable {

  @JsonProperty("name")
  private String name;

  @JsonProperty("job")
  private String job;

  private static final long serialVersionUID = 2204641859228898816L;
}
