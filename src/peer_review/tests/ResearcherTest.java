package peer_review.tests;

/*
 * 	private int id;
	private String name;
	private University affiliation;
	private arrayList<ResearchTopic> researchTopic;
	public arrayList<Article> allocatedArticles;
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import peer_review.models.Researcher;

public class ResearcherTest {
	Researcher researcher1(id,name,affiliation,researchTopic,allocatedArticles);
	
	@Before
	public void setUp() throws Exception {
		researcher1 = new Researcher();
		
	}
	
	@Test
	
	public void testGetResearchTopics{
		assertTrue(researchTopic == researcher1.getResearchTopics());
	}
	
	public void testGetUniversity {
		assertTrue(affiliation == researcher1.getUniversity());
		
	}
	
	public void testGetName {
		assertTrue(name == researcher1.getName());
	}
	
	public void testGetID {
		assertTrue(id == researcher1.getID());
	}
	
	public void testAllocateArticle {
		
	}
}
