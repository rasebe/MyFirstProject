package lab2;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        printMyName();
        sum();
        divide();
        multiply();
        module();
        multipleopone();
        multipleoptwo();


    }
    public static void printMyName(){

        System.out.println("Hello \n Raluca");
    }

    public static void sum(){
        int a = 4;
        int b = 3;
        int sum = a + b;
        System.out.println(sum);
    }
    public static void divide(){
        int c = 12;
        float d = 5f;
        float divide = c/d;
        System.out.println(divide);
    }
    public static void multiply(){
    int e = -5;
    int f = 8;
    int g = 6;
    int multiply = e + 8 * 6;
        System.out.println(multiply);
    }
    public static void module(){
        int h = 55;
        int i = 9;
        int module = (h + i) % i;
        System.out.println(module);
    }
    public static void multipleopone(){
        int j = 20;
        int k = -3;
        int l = 5;
        float m = 8f;
        float multipleopone = (j + (k*l) / m);
        System.out.println(multipleopone);
    }
    public static void multipleoptwo(){
        int n = 5;
        int o = 15;
        int p = 3;
        int q = 2;
        int r = 8;
        int multipleoptwo = (n + (o / p) * q - (r % p));
        System.out.println(multipleoptwo);
    }
}

