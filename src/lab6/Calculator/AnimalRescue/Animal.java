package lab6.Calculator.AnimalRescue;

public abstract class Animal {

    private String color;
    private int weight;
    private float age;
    private char gender;
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void sleeps ();
    public abstract void eats ();
    public abstract void speaks ();

}
