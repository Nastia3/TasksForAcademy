package Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class ChildCompaniesItem{

	@JsonProperty("address")
	private String address;

	@JsonProperty("phone")
	private String phone;

	@JsonProperty("companyName")
	private String companyName;

	@JsonProperty("state")
	private String state;

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setName(String name){
		this.companyName = name;
	}

	public String getName(){
		return companyName;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ChildCompaniesItem that = (ChildCompaniesItem) o;
		return Objects.equals(address, that.address) &&
				Objects.equals(phone, that.phone) &&
				Objects.equals(companyName, that.companyName) &&
				Objects.equals(state, that.state);
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, phone, companyName, state);
	}
}