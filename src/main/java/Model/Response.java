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

	public DeviceManufacturers getDeviceManufacturers(){
		return deviceManufacturers;
	}

	public General getGeneral(){
		return general;
	}

	public Manufacturers getManufacturers(){
		return manufacturers;
	}

	public InitialReporter getInitialReporter(){
		return initialReporter;
	}

	public Device getDevice(){
		return device;
	}
}