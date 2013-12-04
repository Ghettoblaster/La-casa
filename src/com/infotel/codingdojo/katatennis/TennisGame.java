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
		if(player1.equals(aPlayer))
		{
			this.score1 = this.score1 + 1;
		}
		else if(player2.equals(aPlayer))
		{
			this.score2 = this.score2 +1;
		}
	}

	public String getScore() {
		String scoreString;
		if (this.score1 == 4) {
			scoreString = this.player1 + " win the game";
		} else if (this.score2 == 4) {
			scoreString = this.player2 + " win the game";
		} else {
			scoreString = map(this.score1) + " - "+ map(this.score2);
		}
		return scoreString;
	}

	private String map(Integer score) {
		String result;
		if (score == 0) {
			result = "0";
		} else if (score == 1) {
			result = "15";
		} else if (score == 2) {
			result = "30";
		} else {
			result = "40";
		}
		return result;
	}
}


