package de.morpheus.chatbot.brain.io.file.resource;

public class Resource {

	private String name;
	private String path;
	
	public Resource(String path, String name){
		this.name = name;
		this.path = path;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
}
