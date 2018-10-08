package springxml.entity;

public class MemberType {
	
	private String details;
	private String type;
	
	public String getDetails() {
		return details;
	}
	public String getType() {
		return type;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "MemberType [details=" + details + ", type=" + type + "]";
	}
	
	

}
