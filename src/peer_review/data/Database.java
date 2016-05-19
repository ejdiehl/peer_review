
package peer_review.data;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import peer_review.models.Article;
import peer_review.models.Conference;
import peer_review.models.Researcher;
import peer_review.models.University;
import peer_review.models.ResearchTopic;

public class Database {

	private final Map<Integer, Researcher> researchers;
	private final Map<Integer, Article> articles;
	private final Map<String, Conference> conferences;
	private final Vector<University> universities;
	private final Vector<ResearchTopic> researchTopics;
	
	public Database() {
		this(true);
	}

	public Database(boolean initData) {				
		this.articles = new HashMap<>();
		this.researchers = new HashMap<>();
		this.conferences = new HashMap<>();
		this.universities = new Vector();
		this.researchTopics = new Vector();
		
		if (initData) {
			initData();
		}
	}

	public Collection<Article> getArticles() {
		return this.articles.values();
	}

	public Collection<Conference> getConferences() {
		return this.conferences.values();
	}

	public Collection<Researcher> getResearchers() {
		return this.researchers.values();
	}

	//public long getNextCurrentAccountNumber() {
		// I'm assuming that numbers are sequential and no deletions are
		// performed.
		//return currentAccounts.size() + 1;
	//}

	private void initData() {
		
	}

	public void add(Article article) {
		//this.currentAccounts.put(currentAccount.getId(), currentAccount);
	}

	public void add(Conference conference) {
		
	}

	public void add(Researcher researcher) {
		
	}

}
