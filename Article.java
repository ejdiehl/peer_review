package peer_review.models;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Article {

	public Article(int id, String title, Researcher author, List<Researcher> reviewers, Conference conference,
			ResearchTopic researchTopic, Map<Researcher, Float> grades) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.reviewers = reviewers;
		this.conference = conference;
		this.researchTopic = researchTopic;
		this.grades = grades;
	}

	public University getAuthorUniversity() {
		return author.getUniversity();
	}
	
	public Researcher getAuthor() {
		return author;
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
	
	public String getTitle() {
		return title;
	}

	public int numberOfReviewers() {
		
		
		return reviewers.size();
	}

	public void allocateReviewer(Researcher reviewer) {
		reviewers.add(reviewer);
		
		// TODO: Test
	}

	public void setGrade(Researcher reviewer, float grade) {
		
		
		// TODO: Implement
	}

	// TODO: Missing method to calculate grade average? This is not in the specs
	public float getGradeAverage() {
		// TODO: Implement
		return 0;
	}

	public String toStringSimple() {
		return "ID:" + getID() + " Article:" + getTitle();
	}

	@Override
	public String toString() {
		String result = toStringSimple() + "\n";
		result += "Author:\n" + author.toStringSimple() + "\n";
		result += "Reviewers:\n";
		for (Researcher reviewer : reviewers) {
			result += reviewer.toStringSimple() + "\n";
		}

		result += "Conference:\n" + conference.toStringSimple() + "\n";
		result += "Research topic:\n" + researchTopic.toString() + "\n";
		return result;
	}

	private int id;
	private String title;
	private Researcher author;
	private List<Researcher> reviewers;
	private Conference conference;
	private ResearchTopic researchTopic;
	private Map<Researcher, Float> grades;
}
