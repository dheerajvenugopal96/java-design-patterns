package com.patterns.prototype;

public class Game implements Cloneable {

	private int id;
	private String name;
	private Membership membership;
	
	public Game() {
		
	}
	
	//pros - can have as many object of same type of state
	//cons - dependencies harder to handle , during Inheritence is complex
	
	//copy constructor for deep cloning
	public Game(Game game) {
		this.id = game.id;
		this.name = game.name;
		this.membership = new Membership();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//this creates a shallow copy
	/*
	 * @Override protected Game clone() throws CloneNotSupportedException { return
	 * (Game) super.clone(); }
	 */
	
	//deep copy by overriding the clone()
	@Override
	protected Game clone() throws CloneNotSupportedException {
		Game game =  (Game) super.clone();
		game.setMembership(new Membership());
		return game;
		
	}
	@Override
	public String toString() {
		return "Game [id=" + id + ", name=" + name + ", membership=" + membership + "]";
	}
	public Membership getMembership() {
		return membership;
	}
	public void setMembership(Membership membership) {
		this.membership = membership;
	}

	
}
