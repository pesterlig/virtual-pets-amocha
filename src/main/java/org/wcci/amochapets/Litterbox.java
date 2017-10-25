package org.wcci.amochapets;

public class Litterbox {
	
	private int crapacity; // (crap capacity)
	private int craps;
	private int pees;
	
	public Litterbox(int crapacity) {
		this.crapacity = crapacity;	
		this.craps = 0;
		this.pees = 0;
	}
	
	public void addCrap() {
		this.craps ++;
	}
	
	public void addPee() {
		this.pees ++;
	}
	
	public boolean isFull() {
		return crapacity < craps + pees;
	}

	public void cleanLitterbox() {
		this.craps = 0;
		this.pees = 0;
		System.out.println("the litterbox is now clean :D");
	}

	public int getWaste() {
		return this.craps + this.pees;
	}

}
