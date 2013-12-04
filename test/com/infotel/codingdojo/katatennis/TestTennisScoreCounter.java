
package com.infotel.codingdojo.katatennis;

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
	testScoreGameWhenPlayer1Mark() {
		aGame.mark("Jean");
		
		assertEquals("15 - 0", aGame.getScore());
	}

	@Test public void 
	testScoreGameWhenPlayer2Mark() {
		aGame.mark("Michel");
		
		assertEquals("0 - 15", aGame.getScore());
	}
	
	@Test public void
	testScoreGameWhenPlayer1Mark2Times() {
		aGame.mark("Jean");
		aGame.mark("Jean");
		
		assertEquals("30 - 0", aGame.getScore());
	}
	
	@Test public void
	testScoreGameWhenPlayer1Mark3Times() {
		aGame.mark("Jean");
		aGame.mark("Jean");
		aGame.mark("Jean");
		
		assertEquals("40 - 0", aGame.getScore());
	}
	
	@Test public void
	testScoreGameWhenPlayer1Wins() {
		aGame.mark("Jean");
		aGame.mark("Jean");
		aGame.mark("Jean");
		aGame.mark("Jean");
		
		assertEquals("Jean win the game", aGame.getScore());
	}

	@Test public void
	testScoreGameWhenPlayer2Wins() {
		aGame.mark("Michel");
		aGame.mark("Michel");
		aGame.mark("Michel");
		aGame.mark("Michel");
		
		assertEquals("Michel win the game", aGame.getScore());
	}
}
