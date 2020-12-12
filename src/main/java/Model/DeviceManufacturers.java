package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceManufacturers{

	@JsonProperty("correctedData")
	private String correctedData;

	@JsonProperty("typeOfReportableEvent")
	private String typeOfReportableEvent;

	public String getCorrectedData(){
		return correctedData;
	}

	public String getTypeOfReportableEvent(){
		return typeOfReportableEvent;
	}
}