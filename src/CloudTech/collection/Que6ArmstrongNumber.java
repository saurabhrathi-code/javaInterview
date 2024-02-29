package CloudTech.collection;

public class Que6ArmstrongNumber {
    public static void main(String[] args) {
       // int input = 1634;
        int input = 153;
        System.out.println(countNumberOfDigit(input));

        if(isArmStrong(input)) {
            System.out.println("The number is armstrong");
        } else {
            System.out.println("The number is not armstrong");
        }

    }


    public static boolean isArmStrong(int input) {
        int j = input;
        int digit =0;
        int sum = 0;
        int numberOfDigit = countNumberOfDigit(input);
        while (j>0) {
            digit = j%10;
            j = j/10;
            sum = sum + (int) Math.pow(digit,numberOfDigit);
        }
        return input == sum;
    }


    public static int countNumberOfDigit(int input) {
        int count = 0;
        while (input>0) {
            input = input/10;
            count++;
        }
        return count;
    }
}
