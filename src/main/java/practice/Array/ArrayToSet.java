package practice.Array;

import java.util.*;

public class ArrayToSet {

    public static void main(String[] args) {
        Set<String> vowelsSet = new HashSet<>();

        // add example
        vowelsSet.add("a");
        vowelsSet.add("e");
        vowelsSet.add("i");
        vowelsSet.add("o");
        vowelsSet.add("u");

        /**
         * Set to Array conversion
         *
         */
        String[] strArray = vowelsSet.toArray(new String[vowelsSet.size()]);


        /**
         *  Array to Set conversion
         *
         */
        String[] vowels = {"a", "e", "i", "o", "u"};
        Set<String> set = new HashSet<>(Arrays.asList(vowels));

        // or

        Collections.addAll(set, vowels);


        /**
         * Java Set Sorting
         * we know that Hashset doesn't support sorting by default
         *  so better use treeset when you need set to be sorted.
         */
        Set<Integer> intsSet = new HashSet<>();
        intsSet.add(5);
        intsSet.add(4);
        intsSet.add(3);
        intsSet.add(1);
        intsSet.add(2);

        // Approach-3
        Set<Integer> sortedSet = new TreeSet<>(intsSet);
        System.out.println("Sorted Set: " + sortedSet);


    }


}
