package lab2.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        //Cat kitkat = new Cat();
        //kitkat.catName = "KitKat";

        //System.out.println(kitkat.catName);
        //kitkat.meaow();

        //System.out.println(kitkat.catAge);
        //kitkat.jumps();

        //Dog hector = new Dog();
        //System.out.println(hector.dogGender);
        //hector.chews();

        //Horse fargo = new Horse();
        //System.out.println(fargo.horseHungerLevel);

        //Adopter xulescu = new Adopter();
        //System.out.println(xulescu.adopterNameOne);

        //AnimalFood dogfood = new AnimalFood();
        //System.out.println(dogfood.priceOne);

        //RecreationalActivity recreation = new RecreationalActivity();
        //System.out.println(recreation.raNameThree);

        //Veterinarian doctor = new Veterinarian();
        //System.out.println(doctor.vetSpecialtySix);

        Dog hector = new Dog ();
        hector.setName("Hector");
        System.out.println(hector.getName());

        Cat kitycat = new Cat ();
        kitycat.setAge(3.5f);
        System.out.println(kitycat.getAge());

        Horse blacky = new Horse ();
        blacky.setBreed("Frizon");
        System.out.println(blacky.getBreed());

        Dog wolfy = new Dog ();
        wolfy.setColor("brown");
        System.out.println(wolfy.getColor());

        Cat sheeba = new Cat ();
        sheeba.setFavoriteFood("whiskas");
        System.out.println(sheeba.getFavoriteFood());

        Horse carrot = new Horse ();
        carrot.setFavoriteRecreationalActivity("walking");
        System.out.println(carrot.getFavoriteRecreationalActivity());

        hector.setGender('m');
        System.out.println(hector.getGender());

        sheeba.setHealthLevel(9);
        System.out.println(sheeba.getHealthLevel());

        carrot.setHungerLevel(4);
        System.out.println(carrot.getHungerLevel());

        wolfy.setMood(7);
        System.out.println(wolfy.getMood());

        kitycat.setWeight(6);
        System.out.println(kitycat.getWeight());


    }
}
