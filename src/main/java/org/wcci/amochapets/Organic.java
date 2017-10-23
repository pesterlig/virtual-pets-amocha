package org.wcci.amochapets;

public interface Organic {

	void feed(); // affects hunger

	void water(); // affects health

	int getHunger();
	
	int getHealth();
	
//	interface methods - include the 3-part method signature:
//	1.) return (void, in this case)
//	2.) name of method
//	3.) arguments
	
//	ensure that there are getters for the affected variables

//	removed clean from the organic interface, 
//	because it is not implemented by the organic cat,
//	but by the shelter class
	
}
