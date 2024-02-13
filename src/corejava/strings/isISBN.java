package corejava.strings;

public class isISBN {

    public static boolean isValidISBN(String s) {

        s = s.replaceAll("[^\\d]","");

        if(s.length() != 10) {
            return false;
        }

        int sum=0;

        for(int i=0; i<10; i++) {
            int digit = Character.getNumericValue(s.charAt(i));
            sum+=(10-i)*digit;
            }
        return sum%11 ==0;
        }


    public static void main(String[] args) {
        // Test cases
        String isbn1 = "3598215088";
        String isbn2 = "3598215089";

        System.out.println(isbn1 + " " + isValidISBN(isbn1)); // Output: true
        System.out.println(isbn2 + " " + isValidISBN(isbn2)); // Output: false
    }

}
