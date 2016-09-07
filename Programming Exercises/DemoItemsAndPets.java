/**
 * Created by Graeme on 6/09/2016.
 */
public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold item1 = new ItemSold();
        ItemSold item2 = new ItemSold();
        PetSold pet1 = new PetSold();
        PetSold pet2 = new PetSold();

        item1.setDescription("Bird Cage");
        item1.setInvoice(1);
        item1.setPrice(40);

        item2.setDescription("Dog House");
        item2.setInvoice(2);
        item2.setInvoice(100);

        pet1.setDescription("Parrot");
        pet1.setInvoice(3);
        pet1.setPrice(200);
        pet1.setVaccinated(true);
        pet1.setNeutered(false);
        pet1.setHousebroken(false);

        pet2.setDescription("Labrador");
        pet2.setInvoice(4);
        pet2.setPrice(400);
        pet2.setVaccinated(true);
        pet2.setNeutered(true);
        pet2.setHousebroken(true);

        display(item1);
        display(item2);
        display(pet1);
        displayPetData(pet1);
        display(pet2);
        displayPetData(pet2);
    }

    public static void display(ItemSold item){
        System.out.println("\nDescription: " + item.getDescription() +
                "\nInvoice: " + item.getInvoice() +
                "\nPrice: $" + item.getPrice());
    }

    public static void displayPetData(PetSold pet){
        System.out.println("Is Vaccinated: " + pet.getVaccinated() +
                "\nIs Neutered: " + pet.getNeutered() +
                "\nIs Housebroken: " + pet.getHousebroken());
    }
}
