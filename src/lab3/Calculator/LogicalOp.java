package lab3.Calculator;

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
}



















