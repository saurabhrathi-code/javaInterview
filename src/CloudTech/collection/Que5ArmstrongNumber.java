package CloudTech.collection;


public class Que5ArmstrongNumber {
    public static void main(String[] args) {

        int input = 153;
        if(isArmstrong(input)) {
            System.out.println("The number is armstrong");
        } else {
            System.out.println("The number is not armstrong");
        }
    }

    public static boolean isArmstrong(int input) {
        int j = input;
        int sum = 0;
        int digit = 0;

        while (j>0) {
            digit = j%10;
            j = j/10;

            sum = sum + (digit*digit*digit);
        }
        return input == sum;
    }
}











//How to check if a given number is armstrong number or not?
/*
 * input
 * 153
 * 1^3 + 5^3 + 3^3 = 1+125+27 = 153
 *
 * output
 * 153 is a Armstrong number
 * */
