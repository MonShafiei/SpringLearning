package inheritance;

public class Child {
	private String name;
	private String behavior;
	public String getName() {
		return name;
	}
	public String getBehavior() {
		return behavior;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}
	@Override
	public String toString() {
		return "Child [name=" + name + ", behavior=" + behavior + "]";
	}
	

}
