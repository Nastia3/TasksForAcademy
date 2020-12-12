package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InitialReporter{

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("initialReporter")
	private String initialReporter;

	public String getFirstName(){
		return firstName;
	}

	public String getPhone(){
		return phone;
	}

	public String getInitialReporter(){
		return initialReporter;
	}
}