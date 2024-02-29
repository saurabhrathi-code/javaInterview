package CloudTech.collection;

public class StringQuiz {
    public static void main(String[] args) {

        String str1 = "Abc";  // String literal-> available in pool
        String str2 = "Abc";
       // String str3 = new String("Abc"); // available in heap memory
        String str3 = new String("abc");




        System.out.println(str1 == str2); // it will check reference
        System.out.println(str1 == str3);
        //System.out.println(str1.equals(str3));// it will check content

        System.out.println(str1.equalsIgnoreCase(str3)); //it will check content with ignore case


    }
}
