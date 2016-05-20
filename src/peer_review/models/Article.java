package peer_review.models;

import java.util.List;
import java.util.Map;

public class Article {

	public Article(int id, String title, Researcher author, List<Researcher> reviewers, Conference conference, ResearchTopic researchTopic,  Map<Researcher,Float> grades) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.reviewers = reviewers;
		this.conference = conference;
		this.researchTopic = researchTopic;
		this.grades = grades;
	}

	public University getAuthorUniversity() {
		// TODO: Implement
		//return author.getUniversity();
	}

	public ResearchTopic getResearchTopic() {
		return researchTopic;
	}

	public Boolean isResearcherAllocated(Researcher researcher) {
		// TODO: Implement
		return false;
	}

	public int getID() {
		return id;
	}

	public int numberOfReviewers() {
		// TODO: Implement
		return -1;
	}

	public void allocateReviewer(Researcher reviewer) {
		// TODO: Implement
	}

	public void setGrade(Researcher researcher, float grade) {
		// TODO: Implement
	}

	// TODO: Missing method to calculate grade average? This is not in the specs
	public float getGradeAverage(){
		// TODO: Implement
		return 0;
	}

	private int id;
	private String title;
	private Researcher author;
	private List<Researcher> reviewers;
	private Conference conference;
	private ResearchTopic researchTopic;
	private Map<Researcher,Float> grades;
}
