package lab5.Calculator;

public class LogicalOp {


    public int sum (int first, int second, int third, int forth){
        int sum = first + second + third + forth;
        return sum;
    }
    public float sum (float first, int second){
        float sum = first + second;
        return sum;
    }
    public int substraction (int first, int second){
        int substraction = first - second;
        return substraction;
    }
    public int substraction (int first, int second, int third){
        int substraction = first - second - third;
        return substraction;
    }
    public float divide (float first, float second){
        float divide = first/second;
        return divide;
    }
    public double divide (int first, double second){
        double divide = first/second;
        return divide;
    }
    public int multiply (int first, int second){
        int multiply = first * second;
        return multiply;
    }
    public double multiply (int first, double second){
        double multiply = first * second;
        return multiply;
    }

    public int [] getArrayToHundred (){
        int [] myArray = new int [100];
        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
        return myArray;
    }

    public int [] getEvenNumbers (){
        int [] myArray = new int [100];
        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
    return myArray;
    }

    public float averageArray (int[] anArray){
        float sum = 0;
        for (int i = 0; i < anArray.length; i++){
            sum = sum + anArray[i];
        }
        return sum/anArray.length;
    }

    public boolean getSpecificString (String[] myArrayOfString){
        String toCheckString = "danish";
        boolean found = false;
        for (String element:myArrayOfString) {
            if ( element.equals (toCheckString )) {
                found = true;
            }
        }
        if (found) {
            return true;
        } else {
            return false;
        }
    }

    public int  findIndex (int[] myArray, int t) {
        if (myArray == null) return -1;
        int len = myArray.length;
        int i = 0;
        while (i < len) {
            if (myArray[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }

    public void printPattern (int [] tenArray) {
        for (int i = 0; i < tenArray.length; i++) {
            for(int k=tenArray[0]-tenArray[i], m = 0;m<k;m++)
                System.out.print(" ");
            for( int j = 0; j<tenArray[i]; j++)
                System.out.print(" -");
            System.out.println();
        }
    }


    public int getSecondSmallest(int[] arr, int total){
        int small;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (arr[i] > arr[j])
                {
                    small = arr[i];
                    arr[i] = arr[j];
                    arr[j] = small;
                }
            }
        }
        return arr[1];
    }


}



