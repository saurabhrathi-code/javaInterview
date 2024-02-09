package corejava.strings;

public class Q3FindFirstOccurrence {
    public static void main(String[] args) {
        String mainString = "Hello, this is a simple string.";
        String searchString = "is";

        int firstOccurrenceIndex = mainString.indexOf(searchString);

        if(firstOccurrenceIndex != -1) {
            System.out.println("First occurrence found at index: " +firstOccurrenceIndex);
        } else {
            System.out.println("String not found");
        }
    }
}
