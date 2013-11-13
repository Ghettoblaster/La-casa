
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.infotel.codingdojo.katatennis.TennisGame;

public class TestTennisScoreCounter {

	TennisGame aGame;
	
	@Before public void 
	Init() {
		aGame = new TennisGame("Jean", "Michel");
	}
	
	@Test public void 
	testScoreGameAtBeginning() {
		assertEquals("0 - 0", aGame.getScore());
	}
	
	@Test public void 
	testScoreGameWhenPayer1Mark() {
		aGame.mark("Jean");
		
		assertEquals("15 - 0", aGame.getScore());
	}

	@Test public void 
	testScoreGameWhenPayer2Mark() {
		aGame.mark("Michel");
		
		assertEquals("0 - 15", aGame.getScore());
	}
}
