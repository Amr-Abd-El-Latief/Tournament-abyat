package com.abyat.tournament.model.pojo;

public class HandBallPlayer extends Player {
	private enum position {
	    G,         // Goal Keeber Position 
	    F          // Field Player Position 
	  }  
	private int goalsMade;
	private int goalsReceived; 
	
	public HandBallPlayer() {
		super();
	}
	public HandBallPlayer(int goalsMade, int goalsReceived) {
		super();
		this.goalsMade = goalsMade;
		this.goalsReceived = goalsReceived;
	}
	public int getGoalsMade() {
		return goalsMade;
	}
	public void setGoalsMade(int goalsMade) {
		this.goalsMade = goalsMade;
	}
	public int getGoalsReceived() {
		return goalsReceived;
	}
	public void setGoalsReceived(int goalsReceived) {
		this.goalsReceived = goalsReceived;
	}
	/**
	 * for testing purposes
	 */
	@Override
	public String toString() {
	
		return super.toString()+"HandBallPlayer [goalsMade=" + goalsMade + ", goalsReceived=" + goalsReceived + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


}
