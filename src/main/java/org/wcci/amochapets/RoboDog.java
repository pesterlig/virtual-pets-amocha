package org.wcci.amochapets;

public class RoboDog extends Dog implements Robotic {

	private int oilLevel;

	// constructor

	protected RoboDog(String name, String type, int health, int happiness, int oilLevel) {
		super(name, type, health, happiness);
		this.oilLevel = oilLevel;
	}

	// overloaded constructor - name & type only

	public RoboDog(String name, String type) {
		super(name, type);
		this.oilLevel = 50;
	}

	// methods: oil, walk, tick, getters & setters

	@Override
	public void oil() {
		setHealth(getHealth() + (10 * (generator.nextInt(4) + 1)));
		setOilLevel(getOilLevel() + (10 * (generator.nextInt(4) + 1)));

	}
	
//	walk - increases happiness, decreases oil level

	@Override
	public void walk() {
		setHappiness(getHappiness() + 20);
		setOilLevel( getOilLevel() -  (generator.nextInt(4) + 1) );
		
	}
	
	// tick -all needs increase as time passes

	@Override
	public boolean tick() {
		setOilLevel(getOilLevel() - (2 * (generator.nextInt(4) + 1)));
		setHealth(getHealth() - (2 * (generator.nextInt(4) + 1)));
		setHappiness(getHappiness() - (2 * (generator.nextInt(4) + 1)));
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
