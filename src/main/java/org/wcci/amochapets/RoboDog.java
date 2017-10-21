package org.wcci.amochapets;

public class RoboDog extends Dogs implements Robotic {

	private int oilLevel;

	protected RoboDog(String name, String type, int health, int happiness, double overallHealth, int oilLevel) {
		super(name, type, health, happiness, overallHealth);
		this.oilLevel = oilLevel;
	}

	// overloaded constructor - name & type only

	public RoboDog(String name, String type) {
		super(name, type);
		this.health = 50;
		this.happiness = 50;
		this.overallHealth = 50.00;
		this.oilLevel = 50;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

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
	public void oil() {
		// TODO Auto-generated method stub

	}

}
