package org.wcci.amochapets;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ShelterOldVirtualPet {
	// ShelterOldVirtualPet class
	//
	// include appropriate instance variable(s) to store the pets who reside at the
	// shelter
	private Map<String, OldVirtualPet> pets = new HashMap<String, OldVirtualPet>();

	// return a Collection of all of the pets in the shelter
	public Collection<OldVirtualPet> petsValues() {
		return pets.values();
	}

	// return the number of pets in the shelter
	public int getNumberOfPetsInShelter() {
		return pets.size();
	}

	// return a specific OldVirtualPet given its name
	public OldVirtualPet getPetByName(String name) {
		return pets.get(name);
	}

	// allow intake of a homeless pet
	public void inTake(OldVirtualPet pet) {
		pets.put(pet.getName(), pet);
	}

	// allow adoption of a homeless pet
	public void adopt(String name) {
		pets.remove(name);
	}

	// // feed all of the pets in the shelter
	// public void feedAllPets() {
	// for (OldVirtualPet pet : pets.values()) {
	// pet.feedDryFood();
	// }
	// }
	//
	// // water all of the pets in the shelter
	// public void waterAllPets() {
	// for (OldVirtualPet pet : pets.values()) {
	// pet.waterPet();
	// }
	// }
	//
	// // plays (or performs some other interaction(s)) with an individual pet in
	// the
	// // shelter
	// public void playWithOnePetByName(String name) {
	// pets.get(name).play();
	// }
	//
	// // include a tick method that calls the tick method for each of the pets in
	// the
	// // shelter, updating their needs
	// public void tickAllPets() {
	// for (OldVirtualPet pet : pets.values()) {
	// pet.tick();
	// }
	// }
	//
	// public void showAllPetsValuesInSentences() {
	// for (OldVirtualPet pet : pets.values()) {
	// System.out.println("Cat name: " + pet.getName() + "\t Description : " +
	// pet.getDescription());
	// System.out.println("Hunger = " + pet.getHunger() + "%\tHealth = " +
	// pet.getHealth() + "%\tHappiness = "
	// + pet.getHappiness() + "%");
	// pet.computeAndDisplayContentment();
	// System.out.println(" ");
	// }
	//
	// }
	//
	// public void showAllPetsValuesTable() {
	// System.out.println("Name\t\t|Hunger\t\t|Health\t\t|Happiness\t|Contentment");
	// System.out.println("--------------------------------------------------------------------------");
	// for (OldVirtualPet pet : pets.values()) {
	// System.out.println(pet.getName() + "\t\t|" + pet.getHunger() + "%\t\t|" +
	// pet.getHealth() + "%\t\t|"
	// + pet.getHappiness() + "%\t\t|" + pet.getContentment() + "%");
	// System.out.println(" ");
	//
	// }

}
