package lab7.Calculator;

import java.util.Scanner;

public class LogicalOp {

    public void wait (int number){
        try {
           System.out.println("Hello!");
           Thread.sleep(number);
           System.out.println("Bye!");
        }
        catch (Exception e){
        }
    }

    public int [] getIndex (int[] arr, int num) {
        try {
        System.out.println(arr[num]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Inside catch, number too large.");
        }
        return arr;
    }
}

