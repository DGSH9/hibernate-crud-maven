package com.hib.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//dont create constructor or getter setter for id
	private int playerId;
	
	@Column(nullable = false,name="nameOfPlayer")
	private String playerName;
	@OneToOne
	private Team team ;
	private int age;
	
	public Player() {
		
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Player(String playerName, Team team, int age) {
		super();
		this.playerName = playerName;
		this.team = team;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", team=" + team + ", age=" + age + "]";
	}

	

	
	
	
	
}
