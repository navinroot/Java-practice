package practice.collection;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 1. A LinkedHashMap contains values based on the key. It implements the Map interface and extends HashMap class.
 *
 * 2. It contains only unique elements (See this for details)..
 *
 * 3. It may have one null key and multiple null values (See this for details).
 *
 * 4. It is same as HashMap with additional feature that it maintains insertion order.
 *
 * 5. Time complexity
 *      add, remove, contain - 0(1)
 *      next - 0(1)
 *
 */
public class LinkedHashMapCollection {

    public static void main(String[] args) {

        Map<String, String> lhm =
                new LinkedHashMap<String, String>();
        lhm.put("one", "practice.geeksforgeeks.org");
        lhm.put("two", "code.geeksforgeeks.org");
        lhm.put("four", "quiz.geeksforgeeks.org");

        // It prints the elements in same order
        // as they were inserted
        System.out.println(lhm);

        System.out.println("Getting value for key 'one': "
                + lhm.get("one"));
        System.out.println("Size of the map: " + lhm.size());
        System.out.println("Is map empty? " + lhm.isEmpty());
        System.out.println("Contains key 'two'? "+
                lhm.containsKey("two"));
        System.out.println("Contains value 'practice.geeks"
                +"forgeeks.org'? "+ lhm.containsValue("practice"+
                ".geeksforgeeks.org"));
        System.out.println("delete element 'one': " +
                lhm.remove("one"));
        System.out.println(lhm);

    }
}
