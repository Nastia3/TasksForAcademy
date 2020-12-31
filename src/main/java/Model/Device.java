package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Device{

	@JsonProperty("brandName")
	private String brandName;

	@JsonProperty("code")
	private String code;

	public void setBrandName(String brandName){
		this.brandName = brandName;
	}

	public String getBrandName(){
		return brandName;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}
}