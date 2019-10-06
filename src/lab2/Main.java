package lab2;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        printMyName();
        operationOne();
        operationTwo();
        operationThree();
        operationFour();
        operationFive();
        operationSix();

        int resultOne = sum (4,7);
        System.out.println("The result of summing is: " + resultOne);

        int resultTwo = substraction(90,6);
        System.out.println("The result of substraction is: " + resultTwo);

        float resultThree = divide(9,5);
        System.out.println("The result of dividing is: " + resultThree);

        int resultFour = multiply(7,11);
        System.out.println("The result of multiplying is: " + resultFour);

        String[] letter1 = new String[]{"   J", "   J", "J  J", " JJ"};
        String[] letter2 = new String[]{"    a" , "  a   a", "a a a a a ", "  a           a"};
        String[] letter3 = new String[]{"  v       v", "   v     v",  "V   V", "  V"};
        String[] letter4 = new String[]{"    a" , "  a   a", "a a a a a ", "  a           a"};

        String[] concat = new String[letter1.length];
        for (int i = 0 ; i < concat.length ; i++)
            concat[i] = letter1[i] + "\t" + letter2[i] + "\t" + letter3[i]+ "\t" + letter4[i];

        for (String s : concat)
            System.out.println(s);


        float resultFive = average (9,7,45);
        System.out.println(resultFive);

        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");

        int resultSix = remainder(100,6);
        System.out.println(resultSix);

        float resultSeven = toCelsius(105.5f);
        System.out.println(resultSeven);

        float resultEight = toMeters(60.8f);
        System.out.println(resultEight);

        float resultNine = calcSpeed(216.7f, 60.6f);
        System.out.println(resultNine);


    }
    public static void printMyName(){

        System.out.println("Hello \n Raluca");
    }

    public static void operationOne(){
        int a = 4;
        int b = 3;
        int operationOne = a + b;
        System.out.println(operationOne);
    }
    public static void operationTwo(){
        int c = 12;
        float d = 5f;
        float operationTwo = c/d;
        System.out.println(operationTwo);
    }
    public static void operationThree(){
    int e = -5;
    int f = 8;
    int g = 6;
    int operationThree = e + 8 * 6;
        System.out.println(operationThree);
    }
    public static void operationFour(){
        int h = 55;
        int i = 9;
        int operationFour = (h + i) % i;
        System.out.println(operationFour);
    }
    public static void operationFive(){
        int j = 20;
        int k = -3;
        int l = 5;
        float m = 8f;
        float operationFive = (j + (k*l) / m);
        System.out.println(operationFive);
    }
    public static void operationSix(){
        int n = 5;
        int o = 15;
        int p = 3;
        int q = 2;
        int r = 8;
        int operationSix = (n + (o / p) * q - (r % p));
        System.out.println(operationSix);
    }
    public static int sum (int first, int second){
        int sum = first + second;
        return sum;
    }
    public static int substraction (int first, int second){
        int substraction = first - second;
        return substraction;
    }
    public static float divide (float first, float second){
        float divide = first/second;
        return divide;
    }
    public static int multiply (int first, int second){
        int multiply = first * second;
        return multiply;
    }
    public static float average (float first, float second, float third){
        float average = (first + second + third)/3;
        return average;
    }
    public static int remainder (int first, int second){
        int remainder = first % second;
        return remainder;
    }
    public static float toCelsius (float fahrenheit) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
    public static float toMeters (float inches) {
        float meters = inches * 0.0254f;
        return meters;
    }
    public static float calcSpeed (float distance, float time) {
        float speed = distance/time;
        return speed;
    }
}

