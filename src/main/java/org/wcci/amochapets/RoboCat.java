package org.wcci.amochapets;

public class RoboCat extends VirtualPet implements Robotic {

	private int oilLevel;

	protected RoboCat(String name, String type, int health, int happiness, double overallHealth, int oilLevel) {
		super(name, type, health, happiness, overallHealth);
		this.oilLevel = oilLevel;
	}

	// overloaded constructor - name & type only

	public RoboCat(String name, String type) {
		super(name, type);
		this.oilLevel = 50;
	}

	// methods: oil, tick, getters & setters

	@Override
	public void oil() {
		setHealth(getHealth() + (10 * (generator.nextInt(4) + 1)));
		setOilLevel(getOilLevel() + (10 * (generator.nextInt(4) + 1)));

	}

	// tick -all needs increase as time passes

	@Override
	public boolean tick() {
		setHealth(getHealth() - (2 * (generator.nextInt(4) + 1)));
		setHappiness(getHappiness() - (2 * (generator.nextInt(4) + 1)));
		setOilLevel(getOilLevel() - (2 * (generator.nextInt(4) + 1)));
		return false;
	}

	private int getOilLevel() {
		return oilLevel;
	}

	private void setOilLevel(int oilLevel) {
		if (oilLevel > 100) {
			this.oilLevel = 100;
		} else if (oilLevel < 0) {
			this.oilLevel = 0;
		} else {
			this.oilLevel = oilLevel;
		}

	}

}
