package CloudTech.collection;

//Find the palindrome words from the sentence and print them
//input: my name is nitin and I can speak malayalam
//Output: nitin
// I
//malayalam
public class Que2FindPalindromeWordFromSentence {
    public static void main(String[] args) {

        String input = "my name is nitin and I can speak malayalam";
        String[] s = input.split(" ");

        for (String word : s) {
            if(isPalindrome(word)) {
                System.out.println(word);
            }
        }
    }

    // nitin
    public static boolean isPalindrome(String input) {
        int i1=0;
        int i2 = input.length() -1;

        while (i2>i1) {
            if (input.charAt(i1) != input.charAt(i2)) {
                return false;
            }
            i1++; // this will check whole nitin word is palindrome or not
            i2--;
        }
        return true;
    }
}
