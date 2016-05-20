package peer_review.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import peer_review.models.Article;
import peer_review.models.Conference;
import peer_review.models.ResearchTopic;
import peer_review.models.Researcher;
import peer_review.models.University;

public class ArticleTest {
	Article article;
	University authorUniversity;
	ArrayList<ResearchTopic> authorResearchTopics;
	ArrayList<Article> authorAllocatedArticles;
	ArrayList<Researcher> articleReviewers;
	Researcher author;
	Conference articleConference;
	Researcher conferenceCoordinator;
	ResearchTopic articleResearchTopic;
	
	@Before
	public void setUp() throws Exception {
		// Construct new article for testing
		articleResearchTopic = new ResearchTopic("Software");
		authorUniversity = new University("UFRGS");;
		authorResearchTopics = new ArrayList<ResearchTopic>();
		authorAllocatedArticles = new ArrayList<Article>();
		articleReviewers = new ArrayList<Researcher>();
		conferenceCoordinator = new Researcher(2,"Coordinator",authorUniversity,authorResearchTopics,authorAllocatedArticles);
		author = new Researcher(1,"Jonn",authorUniversity,authorResearchTopics,authorAllocatedArticles);
		articleConference = new Conference("ConfName", authorAllocatedArticles, authorAllocatedArticles, articleReviewers, conferenceCoordinator);
		article = new Article(1,"MeuArtigo", author,articleReviewers,articleConference,articleResearchTopic,null);
	}

	@Test
	public void testID() {
		// Is the ID the same one as created in the setUp
		assertTrue(article.getID() == 1);
	}
	
	@Test
	public void testAuthor() {
		// Check if the Author is the same one as created
		assertTrue(article.getAuthorUniversity() == author.getUniversity());
	}
	
	@Test
	public void testResearchTopic() {
		// Check if the ResearchTopic is the same one as created
		assertTrue(article.getResearchTopic() == articleResearchTopic);
	}
	
	
	// TODO: Test setGrade() by checking if the gradeAverage method is correct
	
	@Test
	public void testIsResearcherAllocated() {
		// Test if numberOfReviewers returns 0
		assertTrue(article.numberOfReviewers() == 0);
		// TODO: AllocateReviewer(x)
		//article.allocateReviewer(reviewer);
		// TODO: Test if isResearcherAllocated(x) is true
		
		//assertTrue(article.isResearcherAllocated(reviewer));
		// TODO: Test if a non-allocated Researcher is false
		//assertFalse(article.isResearcherAllocated(reviewer2));
		// Test if numberOfReviewers returns 1
		assertTrue(article.numberOfReviewers() == 1);
	}
	
	
	


}
