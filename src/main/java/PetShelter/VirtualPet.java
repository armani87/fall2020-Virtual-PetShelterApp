package PetShelter;

public class VirtualPet {

    private String name;
    private String description;
    private int hungerBalance;
    private int thirstBalance;
    private int boredomBalance;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHungerBalance() {
        return hungerBalance;
    }

    public int getThirstBalance() {
        return thirstBalance;
    }

    public int getBoredomBalance() {
        return boredomBalance;
    }


    public VirtualPet(String name, String description, int hungerBalance , int thirstBalance , int boredomBalance ) {
        this.name = name;
        this.description = description;
        this.hungerBalance = hungerBalance;
        this.thirstBalance = thirstBalance;
        this.boredomBalance = boredomBalance;
    }



}
