package corejava.strings;

//Write a Program to print only numbers from alphanumeric char array using stream API in java-8.
//solution: ASCII value of character '0' is 48, '1' is 49, '2' is 50. (49-48)=1, (50-48) = 2
public class Q2StringToInt {
    public static void main(String[] args) {
        String str = "12345";

        int result = 0;

        for (int i =0; i< str.length(); i++) {
            result = result * 10 + str.charAt(i) - '0';
        }

        //Method 2:
       // result = Integer.parseInt(str); // might be come NumberFormatException

        System.out.println(result);
    }
}