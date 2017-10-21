package org.wcci.amochapets;

public class DogOrganic extends Dogs implements Organic {

	private int hunger;
	private boolean isCageDirty;

	public DogOrganic(String name, String type, int health, int happiness, double overallHealth, int hunger,
			boolean isCageDirty) {
		super(name, type, health, happiness, overallHealth);
		this.hunger = hunger;
		this.isCageDirty = isCageDirty;

	}

	public DogOrganic(String name, String type) {
		super(name, type);
		this.hunger = 50;
		this.isCageDirty = false;
	}

	public int getHunger() {
		return hunger;
	}

	public boolean getIsCageDirty() {
		return isCageDirty;
	}

	public void setIsCageDirty(boolean isCageDirty) {
		this.isCageDirty = isCageDirty;
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

	private void poop() {
		isCageDirty = true;
		setHunger(getHunger() + 3);
	}

	@Override
	public void feed() {
		setHunger(getHunger() - (10 * (generator.nextInt(4) + 1)));
		if ((getHunger() < 50) && (generator.nextFloat() < 0.50f)) {
			poop();
		}
	}

	private void setHunger(int hunger) {
		if (hunger > 100) {
			this.hunger = 100;
		} else if (hunger < 0) {
			this.hunger = 0;
		} else {
			this.hunger = hunger;
		}

	}

	private void piss() {
		isCageDirty = true;
		setHealth(getHealth() - 3);
	}

	@Override
	public void water() {
		setHealth(getHealth() + (10 * (generator.nextInt(4) + 1)));
		if ((getHealth() > 50) && (generator.nextFloat() < 0.50f)) {
			piss();
		}
	}

	@Override
	public boolean clean() {
		return isCageDirty;

	}

	@Override
	public int getHealth() {
		return super.getHealth();
	}

}
