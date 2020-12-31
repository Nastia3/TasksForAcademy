package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class General{

	@JsonProperty("classification")
	private String classification;

	public void setClassification(String classification){
		this.classification = classification;
	}

	public String getClassification(){
		return classification;
	}
}