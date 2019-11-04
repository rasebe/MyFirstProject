package lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList <>();

        myList.add(56);
        myList.add(3);
        myList.add(27);
        myList.add(5);

        List<String> oneList = new ArrayList <>();

        oneList.add("tomato");
        oneList.add("salad");
        oneList.add("cucumber");
        oneList.add("cheese");
        //System.out.println(myList);

        LogicalOp op = new LogicalOp();
        op.printList(myList);
        op.addToList(myList, 7);
        System.out.println(myList);
        op.printFromPosition(myList,1);
        op.printBackwards(myList);
        op.addString(oneList, "cabbage");
        System.out.println(oneList);
        op.addElement(myList, 13);
        System.out.println(myList);
        op.printIndex(oneList);
        op.printLargest(myList);
        System.out.println(op.printLargest(myList));




    }
}
