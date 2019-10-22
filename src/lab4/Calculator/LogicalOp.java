package lab4.Calculator;

public class LogicalOp {

    public String verifyText(String text) {
        if (text.equals("FastTrack")) {
            return ("Learning text comparison");
        } else {
            return "Got to try some more";

        }
    }

    public int verifyNumbers (int number) {
        if (number >= 2 && number<= 8) {
            return number;
        } else {
            return 0;
        }
    }

    public int checkBiggerNumber (int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String verifyText2 (String text2){
    if (text2.equals("FastTrackIT")) {
        return ("Learning text comparison");
    } else if (!text2.equals("FastTrackIT")) {
        return ("Got to try some more");
    }
    return "0";
}

    public String verifyTextAndNumber (String text3, int number3){
        if (text3.equals("FastTrackIT") && number3 <= 3){
            return (text3 + number3);
        } else if (!text3.equals("FastTrackIT") && number3 >= 4) {
            return (number3 + text3);
        }
        return "none";
    }

    public String verifyNumber (int number4){
        if (number4 > 8||number4 == 6){
            return ("The amount of snow this winter was(cm):" + number4);
        } else {
            return ("The forecast snow is(cm):" + number4);
        }
    }

    public String verifySecondNumber (int number5){
            if (number5 > 3 && number5 != 4){
                return ("The number is greater than 3 and not equal to 4");
            } else if (number5 == 4) {
                return ("The number is equal to 4");
            } else if (number5 < 3) {
                return ("The number is lower than 3");
            } else {
                return "none of the above";
            }
    }

    public String isNumberEven (int number7){
        if (number7 % 2 == 0){
            return ("true");
        } else {
            return ("false");
        }
    }

    public String isEligibleToVote (int number8){
        if (number8 > 18){
            return ("true");
        } else {
            return ("false");
        }
    }

    public String greatestNumber (int number9, int number10, int number11){
        if (number9 > number10 && number9 > number11){
            return ("Greater number is " + number9);
        } else if (number10 > number9 && number10 > number11){
            return ("Greater number is " + number10);
        } else if (number11 > number9 && number11 > number10){
            return ("Greater number is " + number11);
        } else {
            return ("Invalid");
    }
    }
        public void printToHundred (int number){
        for (int i = number; i <= 100; i++){
            System.out.print(i + ", ");
        }
        }

        public void printToMinusHundred (int no2){
            for (int y = no2; y >= -100; y--){
        System.out.print(y + ", ");
            }
        }

        public void sumTwo (int no3, int sum){
            for (int i = no3; i <= 7; i++){
                sum += i;
            }
            System.out.println(sum);
        }

            public void evenNumbers (int n){
                for (int i = 1; i <= n; i++){
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
    }

            public void oddNumbers (int n){
                for (int i = 1; i <= n; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                        }
                    }
                }

                public float getAverageFromNumber (){
                    float sum2 = 0;
                    int no4 = 111;
                    int count = 0;
                    for (int i = no4; i <= 8899; i++){
                        sum2 += i;
                        count ++;
                    }
                    System.out.println(sum2);
                    return (sum2 / count);
                }

                public float getAverage (int no4){
                    float sum3 = 0;
                    int count2 = 0;
                    float average = 0;
                    for(float i= no4; i<=100; i=i+7)
                    {
                        sum3 += i;
                        count2= count2+1;
                        average = sum3/count2;
                    }
                    return (average);
                }

                public void fibonacci (){
                    int biggestNumber = 20;
                    int previousNumber = 0;
                    int nextNumber = 1;
                    for (int i = nextNumber; i <= biggestNumber; ++i)
                    {
                        System.out.print(previousNumber+" ");

                        int sum4 = previousNumber + nextNumber;
                        previousNumber = nextNumber;
                        nextNumber = sum4;
                    }
                }

                public void cozaLozaWoza (int n2, int no6){
                    for(int i=no6;i<n2;i++)
                    {
                        if(i%3==0)
                        {
                            System.out.print("Coza"+" ");
                        }
                        else if(i%5==0)
                        {
                            System.out.print("Loza"+" ");
                        }
                        else if(i%7==0)
                        {
                            System.out.print("Woza"+" ");
                        }
                        else if(i%3==0 && i%5==0)
                        {
                            System.out.print("CozaLoza"+" ");
                        }
                        else if (i%3==0 && i%7==0)
                        {
                            System.out.print("CozaWoza"+" ");
                        }
                        else if (i%5==0 && i%7==0)
                        {
                            System.out.print("WozaLoza"+" ");
                        }
                        else if (i%3==0 && i%5==0 && i%7==0)
                        {
                            System.out.print("CozaLozaWoza"+" ");
                        }
                        else
                        {
                            System.out.print(i+" ");
                        }
                        if(i%11==0)
                        {
                            System.out.println();
                        }
                    }
                }
}











































