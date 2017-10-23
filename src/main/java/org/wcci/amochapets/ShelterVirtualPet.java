package org.wcci.amochapets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShelterVirtualPet {

	// make hashmap to store all pets & info. key: name, values: stats
	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	// return a Collection of all pets in the shelter
	public Collection<VirtualPet> getPets() {
		return pets.values();
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

	public List<Robotic> getRoboticPets() {
		List<Robotic> roboticPets = new ArrayList<>();

		for (VirtualPet virtualPet : getPets()) {
			if (virtualPet instanceof Robotic) {
				roboticPets.add((Robotic) virtualPet);
			}
		}
		return roboticPets;

	}

	// feed all the organic pets using instanceof and the organic interface

	public void feedAllOrganicPets() {

		for (Organic organicPet : getOrganicPets()) {
			organicPet.feed();
		}

		for (VirtualPet virtualPet : getPets())
			if (virtualPet instanceof Organic) {
				((Organic) virtualPet).feed();
			}
	}

	// water all the organic pets

	public void waterAllOrganicPets() {

		for (Organic organicPet : getOrganicPets()) {
			organicPet.water();
		}

		for (VirtualPet virtualPet : getPets())
			if (virtualPet instanceof Organic) {
				((Organic) virtualPet).water();
			}
	}

	// play with one individual pet in the shelter

	public void playWithOnePetByName(String name) {
		pets.get(name).play();

	}

}
