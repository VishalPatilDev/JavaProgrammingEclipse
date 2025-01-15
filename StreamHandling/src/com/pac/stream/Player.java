package com.pac.stream;

import java.io.Serializable;

public class Player implements Serializable{
	int playerId;
	String playerNmae;
	int jersey;
	public Player() {
		
	}
	public Player(int playerId, String playerNmae, int jersey) {
		super();
		this.playerId = playerId;
		this.playerNmae = playerNmae;
		this.jersey = jersey;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerNmae() {
		return playerNmae;
	}
	public void setPlayerNmae(String playerNmae) {
		this.playerNmae = playerNmae;
	}
	public int getJersey() {
		return jersey;
	}
	public void setJersey(int jersey) {
		this.jersey = jersey;
	}
	

}
