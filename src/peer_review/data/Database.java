
package peer_review.data;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import peer_review.models.Article;
import peer_review.models.Conference;
import peer_review.models.Researcher;
import peer_review.models.University;
import peer_review.models.ResearchTopic;

public class Database {

	private final Map<Integer, Researcher> researchers;
	private final Map<Integer, Article> articles;
	private final Map<String, Conference> conferences;
	private final Map<String, University> universities;
	private final Map<String, ResearchTopic> researchTopics;
	
	public Database() {
		this(true);
	}

	public Database(boolean initData) {				
		this.articles = new HashMap<>();
		this.researchers = new HashMap<>();
		this.conferences = new HashMap<String, Conference>();
		this.universities = new HashMap<String, University>();
		this.researchTopics = new HashMap<String, ResearchTopic>();
		
		if (initData) {
			initData();
		}
	}

	public Collection<University> getUniversities() {
		return this.universities.values();
	}

	public Collection<ResearchTopic> getResearchTopics() {
		return this.researchTopics.values();
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

	private void initData() {
		ResearchTopic rt1 = new ResearchTopic("Modularity");
		add(rt1);
		ResearchTopic rt2 = new ResearchTopic("Software	Reuse");
		add(rt2);
		ResearchTopic rt3 = new ResearchTopic("Aspect-oriented	Programming");
		add(rt3);
		ResearchTopic rt4 = new ResearchTopic("Software	Product	Lines");
		add(rt4);
		ResearchTopic rt5 = new ResearchTopic("Software	Architecture");
		add(rt5);
		ResearchTopic rt6 = new ResearchTopic("Software	Reuse");
		add(rt6);
		ResearchTopic rt7 = new ResearchTopic("Software	Testing");
		add(rt7);
		
		University university1 = new University("UFRGS");
		add(university1);
		University university2 = new University("USP");
		add(university2);
		University university3 = new University("UFRJ");
		add(university3);

		Researcher researcher1 = new Researcher(1, "João", university1, 
				new ArrayList<>(Arrays.asList(rt1, rt2, rt4)), new ArrayList<Article>());
		add(researcher1);
		Researcher researcher2 = new Researcher(2, "Ana", university2, 
				new ArrayList<>(Arrays.asList(rt1, rt2, rt5)), new ArrayList<Article>());
		add(researcher2);
		Researcher researcher3 = new Researcher(3, "Manoel", university1, 
				new ArrayList<>(Arrays.asList(rt4, rt7)), new ArrayList<Article>());
		add(researcher3);
		Researcher researcher4 = new Researcher(4, "Joana", university3, 
				new ArrayList<>(Arrays.asList(rt4, rt6, rt5, rt3)), new ArrayList<Article>());
		add(researcher4);
		Researcher researcher5 = new Researcher(5, "Miguel", university1, 
				new ArrayList<>(Arrays.asList(rt1, rt7, rt5)), new ArrayList<Article>());
		add(researcher5);
		
	}

	public void add(Article article) {
		this.articles.put(article.getID(), article);
	}

	public void add(Conference conference) {
		this.conferences.put(conference.getInitials(), conference);
	}

	public void add(University university) {
		this.universities.put(university.getName(), university);
	}

	public void add(ResearchTopic researchTopic) {
		this.researchTopics.put(researchTopic.getName(), researchTopic);
	}

	public void add(Researcher researcher) {
		this.researchers.put(researcher.getID(), researcher);
	}

}
