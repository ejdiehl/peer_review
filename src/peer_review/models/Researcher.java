package peer_review.models;

import java.util.ArrayList;

public class Researcher {
	private int id;
	private String name;
	private University affiliation;
	private ArrayList<ResearchTopic> researchTopic;
	public ArrayList<Article> allocatedArticles;
	
	public ArrayList<ResearchTopic> getResearchTopics(){
		return researchTopic;
	}
	
	public University getUniversity(){
		return affiliation;
	}
	
	public String getName(){
		return name;
	}
	
	public int getID(){
		return id;
	}
	
	public void allocateArticle(Article article){
		// TODO: Implement
	}
	
	public Researcher(int id, String name, University affiliation, ArrayList<ResearchTopic> researchTopic, ArrayList<Article> allocatedArticles){
		this.id = id;
		this.name = name;
		this.affiliation = affiliation;
		this.researchTopic = researchTopic;
		this.allocatedArticles = allocatedArticles;
		
	}
}
