package org.wcci.amochapets;

import java.util.Scanner;

public class ClientVirtualPetShelterApp {

	public static void main(String[] args) {

		ShelterVirtualPet MochaPetShelter = new ShelterVirtualPet();
		Scanner input = new Scanner(System.in);

		RoboCat finnie = new RoboCat("Finnie", "RoboCat", 100, 100, 100, 100);
		MochaPetShelter.inTake(finnie);
		CatOrganic foggy = new CatOrganic("Foggy", "CatOrganic", 75, 75, 75, 25, false);
		MochaPetShelter.inTake(foggy);
		RoboDog happy = new RoboDog("Happy", "RoboDog", 90, 90, 90, 90);
		MochaPetShelter.inTake(happy);
		DogOrganic king = new DogOrganic("King", "DogOrganic", 75, 75, 75, 25, false);
		MochaPetShelter.inTake(king);
		DogOrganic mackie = new DogOrganic("Mackie", "DogOrganic", 40, 40, 100, 100, false);
		MochaPetShelter.inTake(mackie);
		CatOrganic george = new CatOrganic("George", "CatOrganic", 75, 75, 75, 85, false);
		MochaPetShelter.inTake(george);
		System.out.println("Welcome to the Mocha Pet Shelter!");
		System.out.println("There are " + MochaPetShelter.getTotalNumPets() + " animals in the shelter today.");

		String choice = "0";
		// Game Loop:
		while (choice != "q" || choice == "0") {
			displayShelterMenu();
			choice = input.nextLine();
			// Play with pet
			if (choice.contains("1")) {
				System.out.println("\nHey! Ho! Let's Go! \nCheck out all our awesome pets below:\n");

				// displayAsciiKitten();

				MochaPetShelter.showAllPetsValuesInSentences();
				System.out.println("Please choose the pet you would like to play with!\n");
				String petPlayChoice = input.nextLine();
				MochaPetShelter.playWithOnePetByName(petPlayChoice);
				System.out.println(petPlayChoice + " is much happier now!\n");
				MochaPetShelter.showAllPetsValuesTable();

				// Adopt a pet
			} else if (choice.contains("2")) {
				MochaPetShelter.showAllPetsValuesInSentences();
				System.out.println("Please enter the name of the pet you would like to adopt!\n");
				String adoptionChoice = input.nextLine();
				MochaPetShelter.adopt(adoptionChoice);
				System.out.println("Thank you for adopting " + adoptionChoice + "!\n");

				// Feed all the Organic Pets
			} else if (choice.contains("3")) {
				MochaPetShelter.feedAllOrganicPets();
				System.out.println("Thank you for feeding all the organic pets!!! Their hunger has decreased! \n");
				MochaPetShelter.showAllPetsValuesTable();

				// Water all the Organic Pets
			} else if (choice.contains("4")) {
				MochaPetShelter.waterAllOrganicPets();
				System.out.println("Thank you for giving all the organic pets fresh mocha-java!(Water)"
						+ "\n They are perkier (healthier) now!\n");
				MochaPetShelter.showAllPetsValuesTable();

				// Oil all the Robotic Pets
			} else if (choice.contains("5")) {
				MochaPetShelter.oilAllRoboticPets();
				System.out.println("Thank you for giving all the robotic pets fresh oil! They are healthier now!\n");
				MochaPetShelter.showAllPetsValuesTable();

				// Clean all the dirty Dog Cages
			} else if (choice.contains("6")) {
				MochaPetShelter.cleanAllDirtyDogCages();
				System.out.println("Thank you for cleaning the dog cages! They are healthier now!\n");
				MochaPetShelter.showAllPetsValuesTable();

				// Clean the litter box
			} else if (choice.contains("7")) {
				MochaPetShelter.checkLitterBox();
				if (MochaPetShelter.wasteCount >= 5) {
					MochaPetShelter.litterbox.isFull();
					System.out.println(" Ew...the Litterbox is full!");
					MochaPetShelter.litterbox.cleanLitterbox();
					System.out.println(
							"Thank you for cleaning the litterbox!!! All the ORGANIC CATS are healthier now!\n");
					MochaPetShelter.showAllPetsValuesTable();
				} else {
					System.out.println("The litterbox is already pretty clean \n" + "You're off the hook");
				}

				// Admit a pet to the shelter;
			} else if (choice.contains("8")) {
				System.out.println("So, you want to drop off a critter. What is its name?");
				String nameAtIntake = input.nextLine();
				System.out.println("Please enter pet type for for the record: ");
				System.out.println(" 1 = DogOrganic  \n2 =CatOrganic \n3 = RoboDog, or \n4 = RoboCat ");
				String type = input.nextLine();
				if (type == "1") {
					VirtualPet doggo = new DogOrganic(nameAtIntake, type);
					MochaPetShelter.inTake(doggo);
					System.out.println("Thank you for bringing in " + nameAtIntake + "!\n");
					System.out.println(
							"There are " + MochaPetShelter.getTotalNumPets() + " critters in the shelter now.\n");
					MochaPetShelter.showAllPetsValuesInSentences();
				} else if (type == "2") {
					VirtualPet kitty = new CatOrganic(nameAtIntake, type);
					System.out.println("Thank you for bringing in " + nameAtIntake + "!\n");
					MochaPetShelter.inTake(kitty);
					System.out.println(
							"There are " + MochaPetShelter.getTotalNumPets() + " critters in the shelter now.\n");
					MochaPetShelter.showAllPetsValuesInSentences();
				} else if (type == "3") {
					VirtualPet rover = new RoboDog(nameAtIntake, type);
					MochaPetShelter.inTake(rover);
					System.out.println("Thank you for bringing in " + nameAtIntake + "!\n");
					System.out.println(
							"There are " + MochaPetShelter.getTotalNumPets() + " critters in the shelter now.\n");
					MochaPetShelter.showAllPetsValuesInSentences();
				} else if (type == "4") {
					VirtualPet sparky = new RoboCat(nameAtIntake, type);
					MochaPetShelter.inTake(sparky);
					System.out.println("Thank you for bringing in " + nameAtIntake + "!\n");
					System.out.println(
							"There are " + MochaPetShelter.getTotalNumPets() + " critters in the shelter now.\n");
					MochaPetShelter.showAllPetsValuesInSentences();
				} else {
					System.out.println("That was not a valid choice \nPlease select adopt a pet from the menu"
							+ " \n and choose 1-4 ");
				}

			} else if (choice.contains("q")) {
				System.out.println("Thank you for visiting!");
				System.out.println("Game Over");
				System.exit(0);

			} else
				System.out.println("That was not a valid choice");
		}
		MochaPetShelter.tickAllPets();
	}

	public static void displayShelterMenu() {
		System.out.println("What would you like to do? (Input number of choice)");
		System.out.println(" 1 = Play with a pet");
		System.out.println(" 2 = Adopt a pet");
		System.out.println(" 3 = Volunteer to feed all the organic pets");
		System.out.println(" 4 = Volunteer to give all the organic pets fresh water");
		System.out.println(" 5 = Volunteer to oil all the robotic pets");
		System.out.println(" 6 = Volunteer to clean dog cages");
		System.out.println(" 7 = Got a stuffy nose? Volunteer to clean the litterbox");
		// System.out.println(" 9 = Feeling energetic? Volunteer to walk ALL the
		// doggies");
		System.out.println(" 8 = Admit a pet to the shelter");
		System.out.println(" Leave Mocha Pet Shelter! (Type q to quit)");
	}

	// public void computeAndDisplayOverallHealth() {
	// if (getoverallHealth >= 75) {
	// System.out.println(name + " is mostly content now ");
	// } else if (overallHealth >= 50 && overallHealth < 75) {
	// System.out.println(name + " could be better...");
	// } else if (overallHealth < 50 && overallHealth > 0) {
	// System.out.println(name + " is discontent!");
	// }

	//// ascii kitten in the Client App ---Make an ascii puppy too?
	// public void displayAsciiKitten() {
	// char backSlash = '\\';
	// System.out.println(" /|");
	// System.out.println(" =(o ` 7");
	// System.out.println(" ` o =");
	// System.out.println(" / `" + backSlash);
	// System.out.println(" U U\n");
	//
	// }

}
