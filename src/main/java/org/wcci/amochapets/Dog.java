package org.wcci.amochapets;

public abstract class Dog extends VirtualPet {

	public Dog(String name, String type, int health, int happiness) {
		super(name, type, health, happiness);

	}

	public Dog(String name, String type) {
		super(name, type);

	}

	public abstract void walk();

}
