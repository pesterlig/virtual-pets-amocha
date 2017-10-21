package org.wcci.amochapets;

public interface Organic {

	void feed(); // returns hunger

	void water(); // returns health

	int getHunger();
	
	int getHealth();
	
	boolean clean(); // returns the cageDirty or Waste
	
	// Since the Litterbox is either a variable in the shelter, or an object of its
	// own
	// running the clean part of the interface on individual cats is currently
	// problematic
}
