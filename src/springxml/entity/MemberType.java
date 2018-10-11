package springxml.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MemberType {
	
	private String details;
	@Value("Samall")
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
