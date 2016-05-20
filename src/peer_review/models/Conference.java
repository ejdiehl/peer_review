package peer_review.models;

import java.util.ArrayList;

public class Conference {
	private String initials;
	private ArrayList<Article> articlesSubmitted;
	private ArrayList<Article> articlesAllocated;
	private ArrayList<Researcher> committeeMembers;
	private Researcher coordinator;
	
	public Conference(String initials, ArrayList<Article> articlesSubmitted, ArrayList<Article> articlesAllocated, ArrayList<Researcher> committeeMembers, Researcher coordinator) {
		this.initials = initials;
		this.articlesSubmitted = articlesSubmitted;
		this.articlesAllocated = articlesAllocated;
		this.committeeMembers = committeeMembers;
		this.coordinator = coordinator;
	}
	
	public int getLowestSubmittedArticleID() {
		// TODO: Implement
		return -1;
	}
	
	public ArrayList<Researcher> getCandidateReviewers(Article article) {
		// TODO: Implement
		return null;
	}
	
	public ArrayList<Researcher> sortReviewers(ArrayList<Researcher> researchCandidates) {
		// TODO: Implement
		return null;
	}
	
	public Article allocateArticle(Article lowestIdSubmittedArticle, Researcher firstSortedResearcher ) {
		// TODO: Implement
		return null;
	}
	
	public ArrayList<Article> getAcceptedArticles() {
		// TODO: Implement
		return null;
	}
	
	public ArrayList<Article> getRejectedArticles() {
		// TODO: Implement
		return null;
	}
	
	public Researcher getCoordinator() {
		// TODO: Implement
		return null;
	}
	
	public boolean hasUnreviewedArticles() {
		// TODO: Implement
		return false;
	}
}
