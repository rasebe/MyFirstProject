package lab7.Calculator;

import java.lang.reflect.Array;
import java.util.*;

public class Read {

    public double getDouble () {
        double x = 0;

        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner (System.in);
                System.out.print("enter a number: ");
                x = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return x;
    }

    public int getInt () {
        int y = 0;

        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner (System.in);
                System.out.print("enter a number: ");
                y = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return y;
    }

    public float getFloat () {
        float z = 0;

        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner (System.in);
                System.out.print("enter a number: ");
                z = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return z;
    }

    public long getLong () {
        long w = 0;

        boolean repeat = false;
        do {
            try {
                Scanner scan = new Scanner (System.in);
                System.out.print("enter a number: ");
                w = scan.nextLong();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value, please enter a number");
                repeat = true;
            }
        } while (repeat == true);

        return w;
    }

    public int [] getArray () {
        Scanner s = new Scanner(System.in);
        System.out.println("Insert number of integers you want in the array: ");
        int count = s.nextInt();
        System.out.println("array's count is  : " + count);
        int[] array = new int[count];
        for(int i = 0; i < count; i++)
            array[i] = s.nextInt();
        return array;
    }

    public List<Integer> getList () {
    ArrayList<Integer> inputs = new ArrayList<Integer>();
    boolean repeat = false;
        do {
        try {
            Scanner in = new Scanner (System.in);
            System.out.println("Enter some numbers: ");
            while (in.hasNextInt()) {
                inputs.add (in.nextInt());
            repeat = false;
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect value, please enter a number");
            repeat = true;
        }
    } while (repeat == true);

        return inputs;
}

}
