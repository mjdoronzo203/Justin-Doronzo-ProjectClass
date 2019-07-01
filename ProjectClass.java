public class ProjectClass {
	private String name;
	private String description;

	public String elevatorPitch(){
		return name + " : " + description;
	}

	public void project(){
	}
	public void project(String name){
		this.name = name;
	}
	public void project(String name, String description){
		this.name = name;
		this.description = description;
	}
	public String getName(){
		return name;
	}
	public String getDescription(){
		return description;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setDescription(String description){
		this.description = description;
	}
}