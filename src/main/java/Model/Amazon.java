package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Amazon{

	@JsonProperty("address")
	private String address;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("state")
	private String state;

	public String getAddress(){
		return address;
	}

	public String getPhone(){
		return phone;
	}

	public String getState(){
		return state;
	}
}