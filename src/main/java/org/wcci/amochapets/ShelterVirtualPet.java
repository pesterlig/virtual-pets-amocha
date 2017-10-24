package org.wcci.amochapets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShelterVirtualPet {

	// Still need to make hashmap, collection, and table for robocats and robodogs

	// instantiate a new Litterbox, isFull = false
	int wasteCount;
	Litterbox litterbox = new Litterbox(false);

	// make hashmap to store all pets & info. key: name, values: stats
	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	// return a Collection of all pets in the shelter
	public Collection<VirtualPet> getPets() {
		return pets.values();
	}

	// make Map of all Organic Dogs in the shelter
	private Map<String, DogOrganic> dogOrganics = new HashMap<String, DogOrganic>();

	// return a Collection of all Organic Dogs in the shelter
	public Collection<DogOrganic> getDogOrganics() {
		return dogOrganics.values();
	}

	// Clean cages
	public void cleanAllDirtyDogCages() {
		for (DogOrganic dogOrganic : getDogOrganics()) {
			dogOrganic.clean();
			System.out.println();
		}
	}

	// make Map of all Organic Cats in the shelter
	private Map<String, CatOrganic> catOrganics = new HashMap<String, CatOrganic>();

	// return a Collection of all Organic Cats in the shelter
	public Collection<CatOrganic> getCatOrganics() {
		return catOrganics.values();
	}

	// Count cat waste for all cats
	public int checkLitterBox() {
		int wasteCount = 0;
		for (CatOrganic catOrganic : getCatOrganics()) {
			if (catOrganic.getWaste()) {
				wasteCount++;
			}
		}
		return wasteCount;
	}

	// return the total number of all types of pets in the shelter
	public int getTotalNumPets() {
		return pets.size();
	}

	// return a specific pet by name
	public VirtualPet getPetByName(String name) {
		return pets.get(name);
	}

	// allow intake of a new pet to the shelter
	public void inTake(VirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	// allow adoption of a pet from the shelter
	public void adopt(String name) {
		pets.remove(name);
	}

	// make a list of just the organic pets

	public List<Organic> getOrganicPets() {
		List<Organic> organicPets = new ArrayList<>();

		for (VirtualPet virtualPet : getPets()) {
			if (virtualPet instanceof Organic) {
				organicPets.add((Organic) virtualPet);
			}
		}

		return organicPets;
	}

	// make a list of just the robotic pets

	public List<Robotic> getRoboticPets() {
		List<Robotic> roboticPets = new ArrayList<>();

		for (VirtualPet virtualPet : getPets()) {
			if (virtualPet instanceof Robotic) {
				roboticPets.add((Robotic) virtualPet);
			}
		}
		return roboticPets;

	}

	// oil all the robotic pets

	public void oilAllRoboticPets() {
		for (Robotic roboticPet : getRoboticPets()) {
			roboticPet.oil();
		}

	}

	// feed all the organic pets using instanceof and the organic interface

	public void feedAllOrganicPets() {

		// for (Organic organicPet : getOrganicPets()) {
		// organicPet.feed();
		// }

		for (VirtualPet virtualPet : getPets())
			if (virtualPet instanceof Organic) {
				((Organic) virtualPet).feed();
			}
	}

	// water all the organic pets

	public void waterAllOrganicPets() {

		// for (Organic organicPet : getOrganicPets()) {
		// organicPet.water();
		// }

		for (VirtualPet virtualPet : getPets())
			if (virtualPet instanceof Organic) {
				((Organic) virtualPet).water();
			}
	}

	// play with one individual pet in the shelter

	public void playWithOnePetByName(String name) {
		pets.get(name).play();

	}

	// tick all pets in the shelter, updating their stats

	public void tickAllPets() {
		for (VirtualPet virtualPet : pets.values()) {
			virtualPet.tick();
		}
	}

	public void showAllPetsValuesInSentences() {
		for (VirtualPet virtualPet : pets.values()) {
			System.out.println("Pet name: " + virtualPet.getName() + "\t Type : " + virtualPet.getType());
			System.out.println("Overall Health = " + virtualPet.getOverallHealth());
			if (virtualPet.getOverallHealth() >= 75) {
				System.out.println(virtualPet.getName() + " is feeling Mocha-nificent now! ");
			} else if (virtualPet.getOverallHealth() >= 50 && virtualPet.getOverallHealth() < 75) {
				System.out.println(virtualPet.getName() + " could be better...");
			} else if (virtualPet.getOverallHealth() < 50 && virtualPet.getOverallHealth() > 0) {
				System.out.println(virtualPet.getName() + " has poor overall health!");
			}
			System.out.println(" ");
		}

	}

	public void showAllPetsValuesTable() {
		System.out.println("Name\t\t|Health\t\t|Happiness\t|Overall Health");
		System.out.println("--------------------------------------------------------------------------");
		for (VirtualPet pet : pets.values()) {
			System.out.println(pet.getName() + "\t\t|" + pet.getHealth() + "%\t\t|" + pet.getHappiness() + "%\t\t|"
					+ pet.getOverallHealth() + "%");
			System.out.println(" ");
		}
	}
}
