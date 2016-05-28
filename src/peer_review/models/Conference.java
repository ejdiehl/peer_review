package peer_review.models;

import java.util.ArrayList;

public class Conference {
	private String initials;
	private ArrayList<Article> articlesSubmitted;
	private ArrayList<Article> articlesAllocated;
	private ArrayList<Researcher> committeeMembers;
	private Researcher coordinator;

	public Conference(String initials, ArrayList<Article> articlesSubmitted, ArrayList<Article> articlesAllocated,
			ArrayList<Researcher> committeeMembers, Researcher coordinator) {
		this.initials = initials;
		this.articlesSubmitted = articlesSubmitted;
		this.articlesAllocated = articlesAllocated;
		this.committeeMembers = committeeMembers;
		this.coordinator = coordinator;
	}

	public Article getLowestIDSubmittedArticle() {
		int size = articlesSubmitted.size();
		int i;
		Article smallestIDArticle = articlesSubmitted.get(0);
		
		for (i=1;i<size;i++) {
			if (articlesSubmitted.get(i).getID() < smallestIDArticle.getID()) {
				smallestIDArticle = articlesSubmitted.get(i);
			}
		}
		return smallestIDArticle;
	}

	public ArrayList<Researcher> getCandidateReviewers(Article article) {
		ArrayList<Researcher> candidates = null;
		Researcher possibleCandidate;
		int i;
		int size = committeeMembers.size();
		
		for (i=0;i<size;i++) {
			possibleCandidate = committeeMembers.get(i);
			
			if (article.getAuthor() != possibleCandidate && article.getAuthorUniversity() != possibleCandidate.getUniversity() && !(possibleCandidate.getResearchTopics().contains(article.getResearchTopic())) && !(article.isResearcherAllocated(possibleCandidate))) {
				candidates.add(possibleCandidate);
			}
		}
		
		return candidates;
	}

	public ArrayList<Researcher> sortReviewers(ArrayList<Researcher> researchCandidates) {
		ArrayList<Researcher> sortedResearchers = null;
		Researcher researcherWithLeastArticles = researchCandidates.get(0);
		int i;
		
		while (researchCandidates.size() > 0) {
			for (i=0;i<researchCandidates.size();i++) {
				if (researchCandidates.get(i).getAlocatedArticles().size() < researcherWithLeastArticles.getAlocatedArticles().size()) {
					researcherWithLeastArticles = researchCandidates.get(i);
				} else if (researchCandidates.get(i).getAlocatedArticles().size() == researcherWithLeastArticles.getAlocatedArticles().size()) {
					if (researchCandidates.get(i).getID() < researcherWithLeastArticles.getID()) {
						researcherWithLeastArticles = researchCandidates.get(i);
					}
				}
			}
			sortedResearchers.add(researcherWithLeastArticles);
			researchCandidates.remove(researcherWithLeastArticles);
		}
		
		return sortedResearchers;
	}

	public Article allocateArticle(Article lowestIDSubmittedArticle, Researcher firstSortedResearcher) {
		lowestIDSubmittedArticle.allocateReviewer(firstSortedResearcher);
		return lowestIDSubmittedArticle;
	}

	public ArrayList<Article> getAcceptedArticles() {
		// TODO: Implement
		return null;
	}

	public String getInitials() {
		return this.initials;
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

	public String toStringSimple() {
		return getInitials();
	}

	@Override
	public String toString() {
		String result = toStringSimple() + "\n";
		result += "Articles submitted:\n";
		for (Article article : articlesSubmitted) {
			result += article.toStringSimple() + "\n";
		}

		result += "Committe members:\n";
		for (Researcher member : committeeMembers) {
			result += member.toStringSimple() + "\n";
		}

		result += "Coordinator:\n" + coordinator.toStringSimple() + "\n";
		return result;
	}
}
