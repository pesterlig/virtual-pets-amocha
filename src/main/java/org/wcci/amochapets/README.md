	aezarrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrThanks to the generosity of donors, leashes aren't an issue, 
so you can walk all of your virtual dogs at once. This is great, 
since they are less like to soil their cages if walked regularly. 
Did I mention dogs are in cages now? 
Yeah, it keeps the cats from chasing them. Better keep those cages clean.

Cats hang out in a communal area and use a common litter box.
 Don't even bother trying to walk them. What happens if that litter box overflows? Does it reduce pets' health?

We're introducing a health attribute for pets.
 Organic pets have their health decreased by unclean circumstances, and by thirst or hunger growing too high. 
 Robotic pets only lose health if they're not oiled regularly. 
 All pets lose health if their happiness drops too low.
General

introduce ways to track:
 cage cleanliness for organic dogs
 shelter litter box cleanliness for organic cats
 oil/maintenance level for robot animals
All classes

 Encapsulate all instance variables.
 Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.
VirtualPet class and related subclasses/interfaces


last project's requirements:

(create a game loop	10
accepts user input	5
writes output to the console	5
tick()	10
feed all pets	6
water all pets	6
play with one pet	10
adopt a pet	8
receive new pets	8
appropriate instance variables	7
appropriate methods	7
appropriate constructors	8
Style/formatting/code quality	10)

PLUs

 create a model that allows for dogs and cats, either of which may be robotic
 introduce an attribute (instance variable) representing overall health that is updated as a result of other attributes moving in a negative or positive direction, influencing happiness
introduce methods that allow for:
 oiling robotic pets
 walking dogs, decreasing the likelihood that organic dogs will soil their cages, while increasing happiness in all dogs
do not allow:
 feeding/watering robotic pets
 oiling organic pets
 modify the tick method to return a value indicating the amount of waste a pet creates, which should contribute to either:
 amount of waste in the litter box
 amount of waste in an individual dog cage
VirtualPetShelter class

//	public static void showAllPetsValuesTable() {
//		System.out.println("Name\t\t|Health\t\t|Happiness\t|Overall Health");
//		System.out.println("--------------------------------------------------------------------------");
//		for (VirtualPet pet : getPetShelter().getPets()) {
//			// for ( *Type of objects in collection* *pointerName* in *collection* ){
//			//		the pointerName is now available to you as local variable in the loop
//			// }
//			System.out.println(pet.getName() + "\t\t|" + pet.getHealth() + "%\t\t|" + pet.getHappiness() + "%\t\t|" + pet.getWellness() + "%\t\t|" + pet.getType() + "\n");
//		}
//	}

In addition to the last project's requirements:

introduce methods that allow for:

 oiling/maintaining all robotic pets
 cleaning dog cages
 emptying the litterbox
 modify existing methods to only feed/water pets that are not robotic

VirtualPetShelterApp class

In addition to the last project's requirements:

add options to:
 walk all dogs
 clean dog cages
 clean the shelter litterbox
 oil all robotic pets
 
 
 Stretch Tasks

Allow for other types of pets. Are they caged? What maintenance do they require?
Allow an option for giving treats to pets. What sorts of treats do different pets like?
introduce a Cage class for each dog, where cleanliness is tracked, keying these on the dog to which each is assigned (to use a VirtualPet as a key in a HashMap, you should implement hashCode and equals)
Herd your cats

Ideas - a mini game in which there are areas of the shelter and the cats escape to them and must be retrieved - seems like a 
touch screen visual interface.  The more cats you have, the harder it is.
Places the cats can go = front desk, lobby, kitten room, cat room, catio, hallway, kennel area, escape to outdoors, hallway, infirmary
Other - cats and dogs don't die - they escape, and the robots powerdown
Rubric

oilAllRobots()	10
cleanAllCages()	10
emptyLitterBox()	10
has interfaces for either robot/organic or cat/dog	15
instance variable for health	10
modify tick() - amount of waste in the litter box and amount of waste in an individual dog cage	10
encapsulate all instance variables	15
proper modifiers for instance variables	10
style/formatting/code quality	10

// Notes from Zooner:
	// boolean = use isWhatever

	// pointers in the setter arguments have the same
	// name as the instance variable

	// use (generator.nextInt(Num) + 1)
	// to get a fresh random number

	// use (generator.nextFloat() < 0.50f) to get 50% chance

	// setters and getters - oh, my!

	// security, encapsulation, my head asplode!

Class (static) variables: First the public class variables, then the protected, and then the private.
Instance variables: First public, then protected, and then private.
Constructors
Methods: These methods should be grouped by functionality rather than by scope or accessibility. For example, a private class method can be in between two public instance methods. The goal is to make reading and understanding the code easier.
Source: https://web.archive.org/web/20130627193836/http://www.oracle.com/technetwork/java/javase/documentation/codeconventions-141855.html