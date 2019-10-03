package lab2.AnimalRescue;

public class Dog {

    String dogColor = "Brown";
    String dogBreed = "English bulldog";
    int dogWeight = 30;
    float dogAge = 6.5f;
    char dogGender = 'm';
    String dogName = "Hector";
    int dogHealthLevel = 1-10;
    int dogHungerLevel = 1-10;
    int dogMood = 1-10;
    String dogFavoriteFood = "Purizon";
    String dogFavoriteRecreationalActivity = "walking";

    public void barks () {
        System.out.println("woof!");
    }

    public void snores (){
        System.out.println("ZZZ-Zzzz-ZZzzz-hngGGggh-Ppbhww- zZZzzzZZ . . .");
    }

    public void chews (){
        System.out.println("Chomp chomp");
    }

}
