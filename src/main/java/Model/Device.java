package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Device{

	@JsonProperty("brandName")
	private String brandName;

	@JsonProperty("code")
	private String code;

	public String getBrandName(){
		return brandName;
	}

	public String getCode(){
		return code;
	}
}