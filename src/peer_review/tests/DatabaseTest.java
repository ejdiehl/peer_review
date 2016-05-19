
package peer_review.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import peer_review.data.Database;
import peer_review.models.Conference;
import peer_review.models.Article;

public class DatabaseTest {
	
	Database database;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		database = new Database(false);//do not init data
	}

	@Test
	public void initData() {
		database = new Database(true);
		assertEquals(database.getResearchers().size(), 10);		
		assertEquals(database.getConferences().size(), 3);		
		assertEquals(database.getArticles().size(), 11);									
	}
	
	@Test
	public void testadd() {
		database.add(new Conference());
		assertEquals(database.getConferences().size(), 1);
		
		database.add(new Article());
		assertEquals(database.getArticles().size(), 1);
	}
	
}

