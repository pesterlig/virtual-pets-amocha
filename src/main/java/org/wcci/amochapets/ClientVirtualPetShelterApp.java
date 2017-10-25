package org.wcci.amochapets;

import java.util.Scanner;

public class ClientVirtualPetShelterApp {

	private static ShelterVirtualPet mochaPetShelter;
	
	public static ShelterVirtualPet getPetShelter() {
		return mochaPetShelter;
	}



	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		mochaPetShelter = new ShelterVirtualPet();

		RoboCat finnie = new RoboCat("Finnie", "RoboCat");
		mochaPetShelter.inTake(finnie);
		CatOrganic foggy = new CatOrganic("Foggy", "CatOrganic");
		mochaPetShelter.inTake(foggy);
		RoboDog happy = new RoboDog("Happy", "RoboDog");
		mochaPetShelter.inTake(happy);
		DogOrganic king = new DogOrganic("King", "DogOrganic");
		mochaPetShelter.inTake(king);
		DogOrganic mackie = new DogOrganic("Mackie", "DogOrganic");
		mochaPetShelter.inTake(mackie);
		CatOrganic george = new CatOrganic("George", "CatOrganic");
		mochaPetShelter.inTake(george);
		System.out.println("Welcome to the Mocha Pet Shelter!");
		System.out.println("There are " + mochaPetShelter.getTotalNumPets() + " animals in the shelter today.");

		String choice = "0";
		// Game Loop:
		while (choice != "q" || choice == "0") {
			displayShelterMenu();
			choice = input.nextLine();
			if (choice.contains("1")) {
				runPlayWithPetScript(input);
				
			} else if (choice.contains("2")) {
				runAdoptPetScript(input);
				
			} else if (choice.contains("3")) {
				runFeedAllOrganicPetsScript(input);
				
			} else if (choice.contains("4")) {
				runWaterAllOrganicPetsScript(input);
			
			} else if (choice.contains("5")) {
				runOilAllRoboticPetsScript(input);
			
			} else if (choice.contains("6")) {
				runVolunteerToCleanDogCagesScript(input);
			
			} else if (choice.contains("7")) {
				runVolunteerToEmptyTheLitterboxScript(input);
			
			} else if (choice.contains("8")) {
				runAdmitAPetToShelterScript(input);
			
			} else if (choice.contains("9")) {
				runWalkAllDogsScript(input);
			
			} else if (choice.contains("q")) {
				runQuitScript(input);
			
			} else
				System.out.println("That was not a valid choice");
		}
		mochaPetShelter.tickAllPets();
		mochaPetShelter.showAllPetsValuesInSentences();
	}

	private static void runPlayWithPetScript(Scanner input) {
		System.out.println("\nHey! Ho! Let's Go! \nCheck out all our pets below:\n");
		displayAsciiKitten();
		mochaPetShelter.showAllPetsValuesInSentences();
		System.out.println("Please choose the pet you would like to play with!\n");
		String petPlayChoice = input.nextLine();
		mochaPetShelter.playWithOnePetByName(petPlayChoice);
		System.out.println("\n" + mochaPetShelter.getPetByName(petPlayChoice).getName() + " is much happier now!\n");
		mochaPetShelter.showAllPetsValuesTable();
	}

	private static void runAdoptPetScript(Scanner input) {
		mochaPetShelter.showAllPetsValuesInSentences();
		System.out.println("Please enter the name of the pet you would like to adopt!"
				+ "\n Limit yerself to adopting ONE pet only, please!\n");
		String adoptionChoice = input.nextLine();
		mochaPetShelter.adopt(adoptionChoice);
		System.out.println("Thank you for adopting " + (adoptionChoice) + "!\n");
		System.out
				.println("There are " + mochaPetShelter.getTotalNumPets() + " critters in the shelter now.\n");
		mochaPetShelter.showAllPetsValuesInSentences();
	}

	private static void runFeedAllOrganicPetsScript(Scanner input) {
		mochaPetShelter.feedAllOrganicPets();
		System.out.println("Thank you for feeding all the organic pets!!! Their hunger has decreased! \n");
		mochaPetShelter.showAllPetsValuesTable();
	}

	private static void runWaterAllOrganicPetsScript(Scanner input) {
		mochaPetShelter.waterAllOrganicPets();
		System.out.println("Thank you for giving all the organic pets fresh mocha-java!(Water)"
				+ "\n They are perkier (healthier) now!\n");
		mochaPetShelter.showAllPetsValuesTable();
	}

	private static void runOilAllRoboticPetsScript(Scanner input) {
		mochaPetShelter.oilAllRoboticPets();
		System.out.println("Thank you for giving all the robotic pets fresh oil! They are healthier now!\n");
		mochaPetShelter.showAllPetsValuesTable();
	
	}

	private static void runVolunteerToCleanDogCagesScript(Scanner input) {
		mochaPetShelter.cleanAllDirtyDogCages();
		System.out.println("Thank you for cleaning the dog cages! They are healthier now!\n");
		mochaPetShelter.showAllPetsValuesTable();

	}

	private static void runVolunteerToEmptyTheLitterboxScript(Scanner input) {
		mochaPetShelter.checkLitterBox();
		if (mochaPetShelter.getLitterbox().isFull()) {
			System.out.println(" Ew...the Litterbox is full!");
			mochaPetShelter.getLitterbox().cleanLitterbox();
			System.out.println(" Thank you for cleaning the litterbox!!! All the ORGANIC CATS will fix that soon!\n");
			mochaPetShelter.showAllPetsValuesTable();
		} else {
			System.out.println("The litterbox is already pretty clean \n" + "You're off the hook");
		}
	}

	private static void runAdmitAPetToShelterScript(Scanner input) {
		System.out.println("So, you want to drop off a critter. What is its name?");
		String nameAtIntake = input.nextLine();
		System.out.println("Please enter pet type for for the record: ");
		System.out.println(" 1 = DogOrganic  \n2 = CatOrganic \n3 = RoboDog or \n4 = RoboCat ");
		String type = input.nextLine();
		if (type.contains("1")) {
			VirtualPet doggo = new DogOrganic(nameAtIntake, type);
			mochaPetShelter.inTake(doggo);
			System.out.println("Thank you for bringing in " + nameAtIntake + "!\n");
			System.out.println(
					"There are " + mochaPetShelter.getTotalNumPets() + " critters in the shelter now.\n");
			mochaPetShelter.showAllPetsValuesInSentences();
		} else if (type.contains("2")) {
			VirtualPet kitty = new CatOrganic(nameAtIntake, type);
			System.out.println("Thank you for bringing in " + nameAtIntake + "!\n");
			mochaPetShelter.inTake(kitty);
			System.out.println(
					"There are " + mochaPetShelter.getTotalNumPets() + " critters in the shelter now.\n");
			mochaPetShelter.showAllPetsValuesInSentences();
		} else if (type.contains("3")) {
			VirtualPet rover = new RoboDog(nameAtIntake, type);
			mochaPetShelter.inTake(rover);
			System.out.println("Thank you for bringing in " + nameAtIntake + "!\n");
			System.out.println(
					"There are " + mochaPetShelter.getTotalNumPets() + " critters in the shelter now.\n");
			mochaPetShelter.showAllPetsValuesInSentences();
		} else if (type.contains("4")) {
			VirtualPet sparky = new RoboCat(nameAtIntake, type);
			mochaPetShelter.inTake(sparky);
			System.out.println("Thank you for bringing in " + nameAtIntake + "!\n");
			System.out.println(
					"There are " + mochaPetShelter.getTotalNumPets() + " critters in the shelter now.\n");
			mochaPetShelter.showAllPetsValuesInSentences();
		} else {
			System.out.println("That was not a valid choice \nPlease select adopt a pet from the menu"
					+ " \n and choose 1-4 ");
		}
	}
	
	private static void runWalkAllDogsScript(Scanner input) {
		mochaPetShelter.walkAllDogs();
		System.out.println("Thank you for walking the dogs! That should help keep the cages clean!\n");
		mochaPetShelter.showAllPetsValuesTable();

	}

	private static void runQuitScript(Scanner input) {
		System.out.println("Thank you for visiting!");
		System.out.println("Game Over");
		System.exit(0);
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
		System.out.println(" 8 = Admit a pet to the shelter");
		System.out.println(" 9 = Feeling energetic? Volunteer to walk ALL the doggies");
		System.out.println(" Leave Mocha Pet Shelter! (Type q to quit)");
	}

	// ascii kitten in the Client App ---Make an ascii puppy too?
	 public static void displayAsciiKitten() {
	 char backSlash = '\\';
	 System.out.println("          /|");
	 System.out.println("       =(o ` 7");
	 System.out.println("          ` o =");
	 System.out.println("        / `" + backSlash);
	 System.out.println("        U U\n");
	
	 }

}
