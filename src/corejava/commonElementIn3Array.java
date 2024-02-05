package corejava;

import java.util.HashSet;

public class commonElementIn3Array implements add, sub {




    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int[] b = {1, 2, 3, 4, 7, 8, 9};
        int[] c = {1, 1, 2, 3, 6, 7, 12, 13};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

        for (int set : a) {
            set1.add(set);
        }
        for (int set : b) {
            set2.add(set);
        }
        for (int i = 0; i < c.length; i++) {
            if (set1.contains(c[i]) && set2.contains(c[i])) {
                if (set3.contains(c[i]) == false)
                    System.out.println(c[i] + " ");

                set3.add(c[i]);
            }
        }
    }
}
