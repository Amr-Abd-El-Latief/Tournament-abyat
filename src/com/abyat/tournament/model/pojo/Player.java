package com.abyat.tournament.model.pojo;

public abstract class Player {
	private String playerName;
	private String nickName;
	private int playerNumber;
	private String teamName;
	private String position;
	public String getPlayerName() {
		return playerName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * for testing purposes
	 */
	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", nickName=" + nickName + ", playerNumber=" + playerNumber
				+ ", teamName=" + teamName + ", position=" + position + "]";
	}

}
