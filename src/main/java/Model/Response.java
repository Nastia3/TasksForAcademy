package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("deviceManufacturers")
	private DeviceManufacturers deviceManufacturers;

	@JsonProperty("general")
	private General general;

	@JsonProperty("manufacturers")
	private Manufacturers manufacturers;

	@JsonProperty("initialReporter")
	private InitialReporter initialReporter;

	@JsonProperty("device")
	private Device device;

	public void setDeviceManufacturers(DeviceManufacturers deviceManufacturers){
		this.deviceManufacturers = deviceManufacturers;
	}

	public DeviceManufacturers getDeviceManufacturers(){
		return deviceManufacturers;
	}

	public void setGeneral(General general){
		this.general = general;
	}

	public General getGeneral(){
		return general;
	}

	public void setManufacturers(Manufacturers manufacturers){
		this.manufacturers = manufacturers;
	}

	public Manufacturers getManufacturers(){
		return manufacturers;
	}

	public void setInitialReporter(InitialReporter initialReporter){
		this.initialReporter = initialReporter;
	}

	public InitialReporter getInitialReporter(){
		return initialReporter;
	}

	public void setDevice(Device device){
		this.device = device;
	}

	public Device getDevice(){
		return device;
	}
}