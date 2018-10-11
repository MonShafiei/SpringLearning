package springxml.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Member {

	private Integer id;
	private String name;
	private String family;
	
	
	private MemberType memberType;
	
	
	public MemberType getMemberType() {
		return memberType;
	}
	
	@Autowired
	@Required
	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getFamily() {
		return family;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", family=" + family + ", memberType=" + memberType + "]";
	}
	
	
}
