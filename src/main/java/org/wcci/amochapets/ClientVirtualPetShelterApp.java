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
		System.out.println("There are " + MochaPetShelter.getTotalNumPets()    + " animals in the shelter today.");

		 String choice = "0";
		 // Game Loop:
		 while (choice != "q" || choice == "0") {
		 displayShelterMenu();ay
		 choice = input.nextLine();
		
		 if (choice.contains("1")) {
		 System.out.println("\nHey! Ho! Let's Go! \nCheck out all our awesome pets below:\n");
		 
//		 displayAsciiKitten();
		
		 MochaPetShelter.pets in sentences
		 System.out.println("Please choose the pet you would like to play with!\n");
		 String petPlayChoice = input.nextLine();
		 lesliesCathouse.playWithOnePetByName(petPlayChoice);
		 System.out.println(catPlayChoice + " is much happier now!\n");
		 lesliesCathouse.showAllPetsValuesTable();
		
		 } else if (choice.contains("2")) {
		 // Show list of cats, get cat by name, remove cat
		 lesliesCathouse.showAllPetsValuesInSentences();
		 System.out.println("Please enter the name of the cat you would like to
		 adopt!\n");
		 String adoptionChoice = input.nextLine();
		 lesliesCathouse.adopt(adoptionChoice);
		 System.out.println("Thank you for adopting " + adoptionChoice + "!\n");
		 } else if (choice.contains("3")) {
		 lesliesCathouse.feedAllPets();
		 System.out.println("Thank you for feeding all the kitties!!! Their hunger has
		 decreased! \n");
		 lesliesCathouse.showAllPetsValuesTable();
		
		 } else if (choice.contains("4")) {
		 lesliesCathouse.waterAllPets();
		 System.out.println("Thank you for giving all the cats fresh water! They are
		 healthier now!\n");
		 lesliesCathouse.showAllPetsValuesTable();
		
		 } else if (choice.contains("5")) {
		 System.out.println("So, you want to drop off a kitten. What is the kitten's
		 name?");
		 String nameAtIntake = input.nextLine();
		 System.out.println("Please describe your cat for the record:");
		 String descriptionAtIntake = input.nextLine();
		 OldVirtualPet cat3 = new OldVirtualPet(nameAtIntake, descriptionAtIntake);
		 lesliesCathouse.inTake(cat3);
		 System.out.println("Thank you for bringing in " + nameAtIntake + "!\n");
		 System.out.println(
		 "There are " + lesliesCathouse.getNumberOfPetsInShelter() + " cats in the
		 shelter now.\n");
		 lesliesCathouse.showAllPetsValuesInSentences();
		
		 } else if (choice.contains("q")) {
		 System.out.println("Thank you for visiting!");
		 System.out.println("Game Over");
		 System.exit(0);
		
		 } else
		 System.out.println("That was not a valid choice");
		 }
		 lesliesCathouse.tickAllPets();
		
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
		System.out.println(" 8 = Feeling energetic? Volunteer to walk ALL the doggies");
		System.out.println(" 5 = Admit a pet to the shelter");
		System.out.println(" Leave the Leslie's Cat House (Type q to quit)");
	}

//// ascii kitten in the Client App ---Make an ascii puppy too?
//			public void displayAsciiKitten() {
//				char backSlash = '\\';
//				System.out.println("	    /|");
//				System.out.println("	  =(o  ` 7");
//				System.out.println("	     ` o =");
//				System.out.println("	   /   `" + backSlash);
//				System.out.println("	   U U\n");
//
//			}

}
