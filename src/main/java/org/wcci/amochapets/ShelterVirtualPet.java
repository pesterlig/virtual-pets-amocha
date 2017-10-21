package org.wcci.amochapets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShelterVirtualPet {
	
	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();
	
//	return a Collection of all pets in the shelter
	public Collection<VirtualPet> getPets() {
		return pets.values();
	}
	
	public List<Organic> getOrganicPets(){
		List<Organic> organicPets = new ArrayList<>();
		
		for ( VirtualPet virtualPet : getPets() ) {
			if ( virtualPet instanceof Organic ) {
				organicPets.add((Organic)virtualPet);
			}
		}
		
		return organicPets;
	}
	
	public void feedAllOrganicPets() {
		
		for ( Organic organicPet : getOrganicPets() ) {
			organicPet.feed();
		}
		
		for ( VirtualPet virtualPet : getPets() )
			if ( virtualPet instanceof Organic ) {
				((Organic)virtualPet).feed();
			}
		}
	
	}
	
	
	
	
	
		


