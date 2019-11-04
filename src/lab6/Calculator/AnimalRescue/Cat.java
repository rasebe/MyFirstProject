package lab6.Calculator.AnimalRescue;

public abstract class Cat extends Animal {
    @Override
    public void sleeps() {
        System.out.println("Purrrr...");
    }

    @Override
    public void speaks() {
        System.out.println("Meow");
    }
}
