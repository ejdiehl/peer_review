package peer_review.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import peer_review.models.Article;

public class ArticleTest {
	Article article;
	
	@Before
	public void setUp() throws Exception {
		// TODO: Construct new article for testing
		article = new Article(1,"MeuArtigo", );
	}

	@Test
	public void testID() {
		// Test if the ID is the same one as created in the setUp
		assertTrue(article.getID() == 1);
	}
	
	@Test
	public void testAuthor() {
		// TODO: Check if the Author is the same one as created
	}
	
	@Test
	public void testResearchTopic() {
		// TODO: Check if the ResearchTopic is the same one as created
	}
	
	// TODO: Test setGrade() by checking if the gradeAverage method is correct
	
	@Test
	public void testIsResearcherAllocated() {
		// Test if numberOfReviewers returns 0
		assertTrue(article.numberOfReviewers() == 0);
		// TODO: AllocateReviewer(x)
		article.allocateReviewer(reviewer);
		// TODO: Test if isResearcherAllocated(x) is true
		
		assertTrue(article.isResearcherAllocated(reviewer));
		// TODO: Test if a non-allocated Researcher is false
		assertFalse(article.isResearcherAllocated(reviewer2));
		// Test if numberOfReviewers returns 1
		assertTrue(article.numberOfReviewers() == 1);
	}
	
	
	


}
