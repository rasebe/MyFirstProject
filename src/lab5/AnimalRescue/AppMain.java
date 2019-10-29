package lab5.AnimalRescue;

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

        Dog hector = new Dog();
        hector.setName("Hector");
        System.out.println(hector.getName());

        Cat kitycat = new Cat();
        kitycat.setAge(3.5f);
        System.out.println(kitycat.getAge());

        Horse blacky = new Horse();
        blacky.setBreed("Frizon");
        System.out.println(blacky.getBreed());

        Dog wolfy = new Dog();
        wolfy.setColor("brown");
        System.out.println(wolfy.getColor());

        Cat sheeba = new Cat();
        sheeba.setFavoriteFood("whiskas");
        System.out.println(sheeba.getFavoriteFood());

        Horse carrot = new Horse();
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

        Horse smutty = new Horse();
        smutty.setAge(4.5f);
        smutty.setColor("brown");
        smutty.neighs();
        smutty.eats();

        Veterinarian pop = new Veterinarian();
        pop.setVetSpecialty("dermatology");
        pop.setVetName("Pop George");

        RecreationalActivity run = new RecreationalActivity();
        run.setRecreationalActivityName("running");

        Adopter mesesan = new Adopter();
        mesesan.setAvailableAmount(500);
        mesesan.setAdopterName("Mesesan Luiza");

        AnimalFood veggie = new AnimalFood();
        veggie.setQuantity(76);
        veggie.setPrice(179.9f);
        veggie.setBrandName("Veggie dog");

        Parrot jimmy = new Parrot();
        jimmy.walks();

        hector.speaks();

        sheeba.speaks();

    }
}
