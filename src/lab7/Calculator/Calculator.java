package lab7.Calculator;

public class Calculator {

    public int sum (int first, int second){
        int sum = first + second;
        return sum;
    }

    public int substract (int first, int second){
        int substract = first - second;
        return substract;
    }
    public float divide (float first, float second){
        float divide = first/second;
        return divide;
    }

    public int multiply (int first, int second){
        int multiply = first * second;
        return multiply;
    }

    public int checkBiggerNumber (int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String isNumberEven (int number7){
        if (number7 % 2 == 0){
            return ("true");
        } else {
            return ("false");
        }
    }

    public String greatestNumber (int number9, int number10, int number11){
        if (number9 > number10 && number9 > number11){
            return ("Greatest of three numbers is: " + number9);
        } else if (number10 > number9 && number10 > number11){
            return ("Greatest of three numbers is: " + number10);
        } else if (number11 > number9 && number11 > number10){
            return ("Greatest of three numbers is: " + number11);
        } else {
            return ("Please enter different value");
        }
    }
}
