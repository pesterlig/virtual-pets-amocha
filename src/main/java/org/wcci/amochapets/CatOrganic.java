package org.wcci.amochapets;

public class CatOrganic extends VirtualPet implements Organic {

	private int hunger;
	private boolean waste;

	// constructor

	public CatOrganic(String name, String type, int health, int happiness, double overallHealth, int hunger,
			boolean waste) {
		super(name, type, health, happiness, overallHealth);
		this.hunger = hunger;
		this.waste = waste;
	}

	// overloaded constructor - name & type only

	public CatOrganic(String name, String type) {
		super(name, type);
		this.health = 50;
		this.happiness = 50;
		this.overallHealth = 50.00;
		this.hunger = 50;
		this.waste = false;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

	@Override
	public void computeHealth() {
		// TODO Auto-generated method stub

	}

	@Override
	public void computeHappiness() {
		// TODO Auto-generated method stub

	}

	@Override
	public void computeOverallHealth() {
		// TODO Auto-generated method stub

	}

	@Override
	public int feed() {
		return hunger;
		// TODO Auto-generated method stub

	}

	@Override
	public int water() {
		return health;
		// TODO Auto-generated method stub

	}

	@Override
	public boolean clean() {
		return waste;
		// TODO Auto-generated method stub

	}

}
