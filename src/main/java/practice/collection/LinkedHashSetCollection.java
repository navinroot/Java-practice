package practice.collection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 1. LinkedHashSet is an ordered set and maintains the insertion order of its elements.
 *
 * 2. LinkedHashSet only stores unique elements, no duplicates.
 *
 * 3. LinkedHashSet permits one null element to be added.
 *
 * 4. LinkedHashSet implementation is not synchronized hence not thread safe. If LinkedHashSet is to be used in
 * a multi-threaded environment where it is accessed and modified concurrently then it must be synchronized externally.
 * That can be done by wrapping the set with in Collections.synchronizedSet method.
 *
 * 5. The iterators returned by LinkedHashSet's iterator method are fail-fast: if the set is modified at any time
 * after the iterator is created, in any way except through the iterator's own remove method, the Iterator
 * throws a ConcurrentModificationException.
 *
 * 6. Keeping the insertion order in both LinkedHashmap and LinkedHashset have additional associated costs,
 * both in terms of spending additional CPU cycles and needing more memory. If you do not need the insertion
 * order maintained, it is recommended to use the lighter-weight HashSet and HashMap instead.
 *
 * 7. LinkedHashSet internally uses LinkedHashMap.
 */


public class LinkedHashSetCollection {


    public static void main(String[] args) {

        Set<String> linkedset = new LinkedHashSet<String>();

        // Adding element to LinkedHashSet
        linkedset.add("A");
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");

        // This will not add new element as A already exists
        linkedset.add("A");
        linkedset.add("E");

        System.out.println("Size of LinkedHashSet = " +
                linkedset.size());
        System.out.println("Original LinkedHashSet:" + linkedset);
        System.out.println("Removing D from LinkedHashSet: " +
                linkedset.remove("D"));
        System.out.println("Trying to Remove Z which is not "+
                "present: " + linkedset.remove("Z"));
        System.out.println("Checking if A is present=" +
                linkedset.contains("A"));
        System.out.println("Updated LinkedHashSet: " + linkedset);



    }

}
