package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class General{

	@JsonProperty("classification")
	private String classification;

	public String getClassification(){
		return classification;
	}
}