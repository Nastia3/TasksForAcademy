package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChildCompanies{

	@JsonProperty("Google")
	private Google google;

	@JsonProperty("Ebay")
	private Ebay ebay;

	@JsonProperty("Amazon")
	private Amazon amazon;

	public Google getGoogle(){
		return google;
	}

	public Ebay getEbay(){
		return ebay;
	}

	public Amazon getAmazon(){
		return amazon;
	}
}