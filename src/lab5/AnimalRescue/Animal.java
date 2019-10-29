package lab5.AnimalRescue;

public class Animal {
    private String color;
    private String breed;
    private int weight;
    private float age;
    private char gender;
    private String name;
    private int healthLevel;
    private int hungerLevel;
    private int mood;
    private String favoriteFood;
    private String favoriteRecreationalActivity;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getMood() {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteRecreationalActivity() {
        return favoriteRecreationalActivity;
    }

    public void setFavoriteRecreationalActivity(String favoriteRecreationalActivity) {
        this.favoriteRecreationalActivity = favoriteRecreationalActivity;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;

    }
    public void sleeps (){
        System.out.println("ZZZ-Zzzz-ZZzzz-hngGGggh-Ppbhww- zZZzzzZZ . . .");
    }
    public void chews (){
        System.out.println("Chomp chomp");
    }
    public void walks (){
        System.out.println("Clip clop");
    }
    public void eats (){
        System.out.println("Mnom mnom");
    }
    public void speaks (){ System.out.println("..."); }
}
