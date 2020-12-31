package Model;

import java.util.List;
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
	private List<ChildCompaniesItem> childCompanies;

	@JsonProperty("reportSource")
	private String reportSource;

	public void setOfficePhoneNumber(String officePhoneNumber){
		this.officePhoneNumber = officePhoneNumber;
	}

	public String getOfficePhoneNumber(){
		return officePhoneNumber;
	}

	public void setSiteAddress(String siteAddress){
		this.siteAddress = siteAddress;
	}

	public String getSiteAddress(){
		return siteAddress;
	}

	public void setSiteName(String siteName){
		this.siteName = siteName;
	}

	public String getSiteName(){
		return siteName;
	}

	public void setSiteRegionState(String siteRegionState){
		this.siteRegionState = siteRegionState;
	}

	public String getSiteRegionState(){
		return siteRegionState;
	}

	public void setChildCompanies(List<ChildCompaniesItem> childCompanies){
		this.childCompanies = childCompanies;
	}

	public List<ChildCompaniesItem> getChildCompanies(){
		return childCompanies;
	}

	public void setReportSource(String reportSource){
		this.reportSource = reportSource;
	}

	public String getReportSource(){
		return reportSource;
	}
}