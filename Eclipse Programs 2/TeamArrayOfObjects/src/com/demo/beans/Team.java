package com.demo.beans;

import java.util.Arrays;

public class Team {
	private int tid;
	private String tname;
	private String coach;
	private Player captain;
	private Player[] plist;
	
	public Team() {
		super();
	}
	public Team(int tid, String tname, String coach, Player captain, Player[] plist) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.coach = coach;
		this.captain = captain;
		this.plist = plist;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public Player getCaptain() {
		return captain;
	}
	public void setCaptain(Player captain) {
		this.captain = captain;
	}
	public Player[] getPlist() {
		return plist;
	}
	public void setPlist(Player[] plist) {
		this.plist = plist;
	}
	@Override
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + ", coach=" + coach + ", captain=" + captain + ", plist="
				+ Arrays.toString(plist) + "]";
	}
	
	
	
	
}
