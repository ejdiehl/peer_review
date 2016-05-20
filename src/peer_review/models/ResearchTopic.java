package peer_review.models;

public class ResearchTopic {
	private String name;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public ResearchTopic(String name){
		this.name = name;
	}
}
