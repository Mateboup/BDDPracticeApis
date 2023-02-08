package models.responseGet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@Getter
@AllArgsConstructor
public class Data implements Serializable {

	@JsonProperty("LastName")
	private String lastName;
	private int id;
	private String avatar;
	private String firstName;
	private String email;

	private static final long serialVersionUID = 2204641859228898816L;
}
