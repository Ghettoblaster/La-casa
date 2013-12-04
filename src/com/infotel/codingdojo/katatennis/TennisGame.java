package com.infotel.codingdojo.katatennis;

public class TennisGame {

	private final String player1;
	private Integer score1;
	private final String player2;
	private Integer score2;
	
	public TennisGame(String player1, String player2)
	{
		this.player1 = player1;
		this.player2 = player2;
		this.score1 = 0;
		this.score2 = 0;
	}

	public void mark(String aPlayer) {
		if (this.player1.equals(aPlayer))
		{
			this.score1++;
		}
		else if (this.player2.equals(aPlayer))
		{
			
			this.score2++;
		}
	}

	public String getScore() {
		String score="";
		if (this.score1 == 4) {
			score = this.player1 + " " + parseScore(this.score1);
		} else if (this.score2 == 4) {
			score = this.player2 + " " + parseScore(this.score2);
		} else {
			score = parseScore(this.score1) + " - "+ parseScore(this.score2);
		}
		
		return score;
	}

	private String parseScore(Integer score) {
		String result;
		switch (score) {
			case 0 : result = "0";
					 break;
			case 1 : result = "15";
					 break;
			case 2 : result = "30";
					 break;
			case 3 : result = "40";
					 break;
			case 4 : result = "win the game";
					 break;
			default: result = "Error in score";
		}
		return result;
	}
}


