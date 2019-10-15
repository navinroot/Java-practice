package practice.collection;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 1. TreeSet implements the SortedSet interface so duplicate values are not allowed.
 *
 * 2. Objects in a TreeSet are stored in a sorted and ascending order.
 *
 * 3. TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
 *
 * 4. TreeSet does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying
 * to add hetrogeneous objects.
 *
 * 5. TreeSet serves as an excellent choice for storing large amounts of sorted information which are supposed to
 * be accessed quickly because of its faster access and retrieval time.
 *
 * 6. TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree.
 * Therefore operations like add, remove and search take O(Log n) time. And operations like printing n elements
 * in sorted order takes O(n) time.
 *
 *
 */

public class TreeSetCollection {


    public static void main(String[] args) {


// Create a sorted set of Integers
        SortedSet<Integer> setWithNaturalOrdering = new TreeSet<>();
        setWithNaturalOrdering.add(5);
        setWithNaturalOrdering.add(9);
        setWithNaturalOrdering.add(4);
        setWithNaturalOrdering.add(2);
        setWithNaturalOrdering.forEach(System.out::println);


        // Create a sorted set with user defined class
        SortedSet<Person> sortedSet = new TreeSet<>();
        sortedSet.add(new Person(1, "Mark"));
        sortedSet.add(new Person(2, "Vispi"));
        sortedSet.add(new Person(3, "Harmony"));
        sortedSet.forEach(System.out::println);


        // we can also provide instance of Comparator implementation instead of lambda
        SortedSet<Person> customOrderedSet = new TreeSet<>((p1, p2) -> p1.id - p2.id);
        customOrderedSet.addAll(sortedSet);
        customOrderedSet.forEach(System.out::println);


    }


}


class Person implements Comparable<Person> {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}