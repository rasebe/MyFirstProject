package lab7.Calculator;

public class Program {

    public void printMenuItems() {
        System.out.println(
                "Hello !\n" +
                        "Choose an option from the menu: \n" +
                        "0. Exit\n" +
                        "1. Sum\n" +
                        "2. Substract\n" +
                        "3. Divide\n" +
                        "4. Multiply\n" +
                        "5. Check bigger number\n" +
                        "6. Is number even\n" +
                        "7. Greatest of three numbers\n"
        );
    }

    Calculator calc = new Calculator();
    Read read = new Read();

    public boolean runProgramOptions() {
        printMenuItems();

        int numberFromUser = read.getInt();

        switch (numberFromUser) {
            case 1:
                sum();
                return true;
            case 2:
                substract();
                return true;
            case 3:
                divide();
                return true;
            case 4:
                multiply();
                return true;
            case 5:
                checkBiggerNumber();
                return true;
            case 6:
                isNumberEven();
                return true;
            case 7:
                greatestNumber();
                return true;
            case 0:
                System.out.println("Buh Bye!");
                break;

            default:
                System.out.println("The option does not exist, try again!");
                return true;
        }
        return false;


    }

    public void runProgram() {
        boolean repeat;
        do {
            repeat = runProgramOptions();

        } while (repeat == true);
    }

    public void sum(){
        int result = calc.sum(read.getInt(), read.getInt());
        System.out.println("The sum is: " + result);
    }

    public void substract(){
        int result = calc.substract(read.getInt(), read.getInt());
        System.out.println("Substraction is: " + result);
    }

    public void divide(){
        float result = calc.divide(read.getFloat(), read.getFloat());
        System.out.println("Divide result is: " + result);
    }

    public void multiply(){
        int result = calc.multiply(read.getInt(), read.getInt());
        System.out.println("Multiply result is: " + result);
    }

    public void checkBiggerNumber(){
        int result = calc.checkBiggerNumber(read.getInt(), read.getInt());
        System.out.println("Biggest number is: " + result);
    }

    public void isNumberEven(){
        String result = calc.isNumberEven(read.getInt());
        System.out.println("Is number even?: " + result);
    }

    public void greatestNumber(){
        String result = calc.greatestNumber(read.getInt(), read.getInt(), read.getInt());
        System.out.println(result);
    }
}
