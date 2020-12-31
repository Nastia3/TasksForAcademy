package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InitialReporter{

	@JsonProperty("firstName")
	private String firstName;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("initialReporter")
	private String initialReporter;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setInitialReporter(String initialReporter){
		this.initialReporter = initialReporter;
	}

	public String getInitialReporter(){
		return initialReporter;
	}
}