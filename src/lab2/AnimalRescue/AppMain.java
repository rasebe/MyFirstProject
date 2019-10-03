package lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Cat kitkat = new Cat();
        kitkat.catName = "KitKat";

        System.out.println(kitkat.catName);
        kitkat.meaow();

        System.out.println(kitkat.catAge);
        kitkat.jumps();

        Dog hector = new Dog();
        System.out.println(hector.dogGender);
        hector.chews();

        Horse fargo = new Horse();
        System.out.println(fargo.horseHungerLevel);

        Adopter xulescu = new Adopter();
        System.out.println(xulescu.adopterNameOne);

        AnimalFood dogfood = new AnimalFood();
        System.out.println(dogfood.priceOne);

        RecreationalActivity recreation = new RecreationalActivity();
        System.out.println(recreation.raNameThree);

        Veterinarian doctor = new Veterinarian();
        System.out.println(doctor.vetSpecialtySix);


    }
}
