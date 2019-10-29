package lab5.Calculator;

public class Main {

    public static void main(String[] args) {

        LogicalOp calculator = new LogicalOp();
        System.out.println(calculator.sum(8,5,12,50));
        System.out.println(calculator.sum (7.5f, 8));
        System.out.println(calculator.substraction (90, 7));
        System.out.println(calculator.substraction (45, 31, 16));
        System.out.println(calculator.divide (8.7f, 2.3f));
        System.out.println(calculator.divide (30, 20.8));
        System.out.println(calculator.multiply (90, 6));
        System.out.println(calculator.multiply (12, 10.2));

        int [] newArray = calculator.getArrayToHundred();
        for (int i = 0; i < 100; i++){
            System.out.println("Pe pozitia " + (i ) + " avem valoarea " + newArray[i]);
        }


        int [] evenArray = calculator.getEvenNumbers();
        for (int i = 0; i < evenArray.length; i++){
            if(evenArray[i]%2 == 0){
                System.out.println(evenArray[i]);
            }
}
        int [] averageArray = {17 ,12 ,16 ,12 ,137};
        System.out.println(calculator.averageArray (averageArray));

        //String [] myArrayOfString = {"Bulldog", "Boxer", "Terrier", "Mastiff", "Amstaff"};
        //String [] anotherOne = calculator.getSpecificString();

        int[] myArray = {78, 17, 16, 18, 38, 65, 47, 86, 19, 6};
        System.out.println("Pozitia numarului 16 este: " + calculator.findIndex(myArray, 16));

        //int[] tenArray = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        //int [] nouArray = calculator.printPattern();

        int [] arr = {90, 12, 75, 16, 38, 24, 53};
        System.out.println("Al doilea cel mai mic numar este: "+ calculator.getSecondSmallest(arr,7));

        int a[]={17, 12 ,3, 47, 9, 15};
        int b[]=new int[a.length];

        for(int i=0;i<a.length;++i){
            b[i]=a[i];
        }
        for(int i=0;i<b.length;++i){
            System.out.print(b[i]+" ");
        }
    }
}



