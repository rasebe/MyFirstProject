package lab6.Calculator.AnimalRescue;

public class AppMain {
    public static void main(String[] args) {
        Cat sheeba = new Persian();
        sheeba.speaks();
        sheeba.eats();

        Cat sylvester = new BritishLonghair();
        sylvester.eats();

        Dog hector = new EnglishBulldog();
        hector.eats();
        hector.speaks();
        hector.sleeps();
    }
}
