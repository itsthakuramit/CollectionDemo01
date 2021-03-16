package com.stackroute.mar16demos;



public class Player {
	
	private String playerid;
	private String playername;
	private String sports;
	private String country;
	
	public Player() {
		
	}

	public Player(String playerid, String playername, String sports, String country) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.sports = sports;
		this.country = country;
	}

	public String getPlayerid() {
		return playerid;
	}

	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	public String getSports() {
		return sports;
	}

	public void setSports(String sports) {
		this.sports = sports;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", sports=" + sports + ", country="
				+ country + "]";
	}
	
	
	

	
}
