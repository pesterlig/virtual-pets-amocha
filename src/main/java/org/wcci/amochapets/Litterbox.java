package org.wcci.amochapets;

public class Litterbox {
	
	private boolean isFull;

	public Litterbox(boolean isFull) {
		this.isFull = isFull;		
	}
	
	
	
	public boolean isFull() {
		return isFull;
	}



	public boolean cleanLitterbox() {
		return isFull == false;
	}

}
