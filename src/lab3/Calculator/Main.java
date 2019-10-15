package lab3.Calculator;

public class Main {
    public static void main(String[] args) {
        String text = "FastTrack";
        LogicalOp op = new LogicalOp();
        String result = op.verifyText(text);
        System.out.println(result);


        int number = 7;
        System.out.println(op.verifyNumbers(number));

        Calculator calc = new Calculator();
        System.out.println(calc.sum(3,5));
        System.out.println(calc.substraction(9,6));
        System.out.println(calc.divide(12,5));
        System.out.println(calc.multiply(4,6));

        int biggest = op.checkBiggerNumber(9,11);
        System.out.println("The bigger number is: " + biggest);

        String text2 = "NotFastTrackIT";
        System.out.println(op.verifyText2(text2));

        String text3 = "FastTrackIT";
        int number3 = 5;
        System.out.println(op.verifyTextAndNumber(text3, number3));

        int number4 = 7;
        System.out.println(op.verifyNumber(number4));

        int number5 = 2;
        System.out.println(op.verifySecondNumber(number5));

        int number6 = 16;
        System.out.println(number6);
        switch(number6)
        {
            case 2:
                System.out.println("Case2: The number is " + number6);break;
            case 16:
                System.out.println("Case16: The number is " + number6);break;
            case 20:
                System.out.println("Case20: The number is " + number6);break;
            default:
                System.out.println("Default: The number is " + number6);
    }

    int number7 = 5;
        System.out.println(op.isNumberEven(number7));

    int number8 = 22;
        System.out.println(op.isEligibleToVote(number8));

    int number9 = 12;
    int number10 = 76;
    int number11 = 3;
        System.out.println(op.greatestNumber(number9, number10, number11));
    }
}
