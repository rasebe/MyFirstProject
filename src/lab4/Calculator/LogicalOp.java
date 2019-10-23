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
    // FOR loop
        public void printToHundred (int number){
        for (int i = number; i <= 100; i++){
            System.out.print(i + ", ");
        }
        }

        public void printToMinusHundred (int no2){
            for (int y = no2; y > -100; y--){
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

                public int countFromNumToHundred (int num){
                    int sum5 = 0;
                    for(int i = num; i <= 100; ++i)
                    {
                        sum5 += i;
                    }
                    return (sum5);
                }

                public float averageFromGivenNumToHundred (int num2){
                    int sum6 = 0;
                    int count3 = 0;
                    float average2 = 0;
                    for(float i= num2; i<=100; i++)
                    {
                        sum6 += i;
                        count3= count3+1;
                        average2 = sum6/count3;
                    }
                    return (average2);
                }

                public void starPattern (){
                    for(int i = 1; i < 7; i++){
                        for(int j = 1; j <= 7 - i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                }


                //WHILE loop

    public void printToHundredWhile (int number){
        while (number <= 100){
            number++;
            System.out.print(number + ", ");
        }
    }

    public void printToMinusHundredWhile (int number){
        while (number > -100){
            number--;
            System.out.print(number + ", ");
    }
    }

    public void printBetweenTwoNumbers (int num, int number){
        while (num < number){
            num++;
            System.out.print(num + " ");
    }
    }

    public void evenNumbersWhile (int n){
        //int n = 100;
        int i = 1;
        while (i <= n){
            i++;
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public void oddNumbersWhile (int num){
        //int num = 100;
        int i = 1;
        while (i < num){
            i++;
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
                public float getAverageFromNumber (){
                    float sum = 0;
                    int number = 111;
                    int count = 0;
                    while (number <= 8899){
                        sum = sum + number;
                        number ++;
                        count ++;
                    }
                    return (sum / count);
                }

    public float getAverage (int num){
        int sum = 0;
        int count = 0;
        int average = 0;
        while (num <= 100) {
            num = num+7;
            sum += num;
            count= count+1;
            average = sum/count;
        }
        return (average);
    }

    public void fibonacci (){
        int biggestNumber = 20;
        int previousNumber = 0;
        int nextNumber = 1;
        int i=1;
        while(i <= biggestNumber)
        {
            System.out.print(previousNumber+" ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }
    public void cozaLozaWoza (){
        int i=1;
        while (i<111)
        {
            i++;
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











































