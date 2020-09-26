package PetShelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;
    VirtualPet pet3;


    @BeforeEach
    public void setUp(){
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("1", "description", 5, 5, 5);
        pet2 = new VirtualPet("2", "description", 5, 5, 5);
        pet3 = new VirtualPet("3", "description", 5, 5, 5);
    }

    @Test
    public void shouldBeAbleToAddPet(){
        underTest.add(pet1);
        VirtualPet retrievedPet = underTest.findPet("1");
        assertEquals(retrievedPet, pet1);
    }

    @Test
    public void shouldAddThreePets(){
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.add(pet3);

        Collection<VirtualPet> allPets = underTest.getAllPets();
        assertThat(allPets,containsInAnyOrder(pet2, pet1, pet3));
    }

    @Test
    public void shouldBeAbleTpRemovePet() {
        underTest.add(pet1);
        underTest.remove(pet1);
        VirtualPet retrievedPet = underTest.findPet("");
        assertEquals(retrievedPet, null);

    }
    @Test
    public void shouldFeedPet() {
        VirtualPet underTest = new VirtualPet("", "", 5, 5, 5);
        int result = underTest.getHungerBalance();
        assertEquals(4, result);
    }

    @Test
    public void shouldWaterPet() {
        VirtualPet underTest = new VirtualPet("", "", 5, 5, 5);
        int result = underTest.getThirstBalance();
        assertEquals(4, result);
    }

    @Test
    public void shouldPlayWithPet() {
        VirtualPet underTest = new VirtualPet("", "", 5, 5, 5);
        int result = underTest.getBoredomBalance();
        assertEquals(4, result);
    }


}
