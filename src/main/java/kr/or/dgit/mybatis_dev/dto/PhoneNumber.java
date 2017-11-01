package kr.or.dgit.mybatis_dev.dto;

public class PhoneNumber {
	private String countryCode;
	private String stateCode;
	private String number;
	
	public PhoneNumber() {
		
	}

	public PhoneNumber(String countryCode, String stateCode, String number) {
		super();
		this.countryCode = countryCode;
		this.stateCode = stateCode;
		this.number = number;
	}
	
	public PhoneNumber(String str) {
		if(str!=null) {
			String[] parts=str.split("-");
			
			if(parts.length>0) this.countryCode=parts[0];
			if(parts.length>0) this.stateCode=parts[0];
			if(parts.length>0) this.number=parts[0];
		}
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %s]", countryCode, stateCode, number);
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
}
