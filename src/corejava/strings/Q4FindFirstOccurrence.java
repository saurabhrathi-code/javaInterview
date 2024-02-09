package corejava.strings;

public class Q4FindFirstOccurrence {
    public static void main(String[] args) {
        String mainString = "Hello, this is a simple string.";
        char searchChar = 'i';

        int index = -1;
        for(int i=0; i<mainString.length(); i++) {
            if(mainString.charAt(i) == searchChar) {
                index = i;
                break;
            }
        }

        if(index != -1) {
            System.out.println("First occurrence found at index: " +index);
        } else {
            System.out.println("String not found");
        }
    }
}
