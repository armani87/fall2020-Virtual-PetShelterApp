package PetShelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new HashMap<>();

    public void add(VirtualPet addToShelter) {
        pets.put(addToShelter.getName(), addToShelter);
        
    }

    public VirtualPet findPet(String name ) {
        return pets.get(name);
    }

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public void remove(VirtualPet petToRemove) {
        pets.remove(petToRemove.getName(), petToRemove);
    }


}
