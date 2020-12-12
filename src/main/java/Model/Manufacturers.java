package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Manufacturers{

	@JsonProperty("officePhoneNumber")
	private String officePhoneNumber;

	@JsonProperty("siteAddress")
	private String siteAddress;

	@JsonProperty("siteName")
	private String siteName;

	@JsonProperty("siteRegionState")
	private String siteRegionState;

	@JsonProperty("childCompanies")
	private ChildCompanies childCompanies;

	@JsonProperty("reportSource")
	private String reportSource;

	public String getOfficePhoneNumber(){
		return officePhoneNumber;
	}

	public String getSiteAddress(){
		return siteAddress;
	}

	public String getSiteName(){
		return siteName;
	}

	public String getSiteRegionState(){
		return siteRegionState;
	}

	public ChildCompanies getChildCompanies(){
		return childCompanies;
	}

	public String getReportSource(){
		return reportSource;
	}
}