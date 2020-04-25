package com.abyat.tournament.model.pojo;

public class BasketBallPlayer extends Player{
	private int scoredPoints;
	private int rebounds;
	private int assists;
	
	public int getScoredPoints() {
		return scoredPoints;
	}
	public BasketBallPlayer(int scoredPoints, int rebounds, int assists) {
		super();
		this.scoredPoints = scoredPoints;
		this.rebounds = rebounds;
		this.assists = assists;
	}
	public BasketBallPlayer() {
		super();
	}
	public void setScoredPoints(int scoredPoints) {
		this.scoredPoints = scoredPoints;
	}
	public int getRebounds() {
		return rebounds;
	}
	

	public void setRebounds(int rebounds) {
		this.rebounds = rebounds;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	
	/**
	 * for testing purposes
	 */
	@Override
	public String toString() {
		
		return super.toString()+"BasketBallPlayer [scoredPoints=" + scoredPoints + ", rebounds=" + rebounds + ", assists=" + assists
				+ ", getPlayerName()=" + getPlayerName() + ", getPosition()=" + getPosition() + ", getNickName()="
				+ getNickName() + ", getPlayerNumber()=" + getPlayerNumber() + ", getTeamName()=" + getTeamName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
