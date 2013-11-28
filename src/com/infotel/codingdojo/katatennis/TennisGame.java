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
			this.score1=incrementScore(this.score1);
		}
		else if(player2.equals(aPlayer))
		{
			this.score2=incrementScore(this.score2);
		}
	}

	public String getScore() {
		
		return this.score1 + " - "+ this.score2;
	}

	private Integer incrementScore(Integer score)
	{
		Integer result=score;
		if(score<30)
		{
			result=result+15;
		} else if (score==40) {
			result = result + 0 ;
		} else {
			result=result+10;
		}
		return result;
	}
}


