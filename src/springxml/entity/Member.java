package springxml.entity;

public class Member {

	private Integer id;
	private String name;
	private String family;
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
		return "Member [id=" + id + ", name=" + name + ", family=" + family + "]";
	}
	
	
}
