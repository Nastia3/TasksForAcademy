package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeviceManufacturers{

	@JsonProperty("correctedData")
	private String correctedData;

	@JsonProperty("typeOfReportableEvent")
	private String typeOfReportableEvent;

	public void setCorrectedData(String correctedData){
		this.correctedData = correctedData;
	}

	public String getCorrectedData(){
		return correctedData;
	}

	public void setTypeOfReportableEvent(String typeOfReportableEvent){
		this.typeOfReportableEvent = typeOfReportableEvent;
	}

	public String getTypeOfReportableEvent(){
		return typeOfReportableEvent;
	}
}