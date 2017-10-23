package org.wcci.amochapets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShelterVirtualPet {

	// instantiate a new Litterbox, isFull = false

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

	// make Map of all Organic Cats in the shelter
	private Map<String, CatOrganic> catOrganics = new HashMap<String, CatOrganic>();

	// return a Collection of all Organic Cats in the shelter
	public Collection<CatOrganic> getCatOrganics() {
		return catOrganics.values();
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
	
//	tick all pets in the shelter, updating their stats

	public void tickAllPets() {
		for (VirtualPet virtualPet : pets.values()) {
			virtualPet.tick();
		}
	}
	
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

	
	 public void showAllPetsValuesInSentences() {
		 for ( VirtualPet virtualPet : pets.values() ) {
		 System.out.println("Pet name: " + pet.getName() + "\t Type : " +
		 virtualPet.getType());
		 System.out.println("Overall health = " + virtualPet.getOverallHealth());
		 pet.computeAndDisplayContentment();
		 System.out.println(" ");
		 }
		
		 }
	
	
	
	
	
	
	
	
	
	

}
