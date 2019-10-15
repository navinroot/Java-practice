package practice.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

    /**
     *  1. Java LinkedList is an implementation of the List and Deque interfaces. Internally, it is an implemented
     *  using Doubly Linked List Data Structure.
     *
     *  2. We can create a synchronised LinkedList using Collections.synchronizedList() method.
     *
     *  3. It does not implement RandomAccess interface. So we can access elements in sequential order only.
     *  It does not support accessing elements randomly.
     *
     *  4.
     *  Best Usecase scenario: When our frequently used operation is adding or removing elements in the middle
     *  of the List, LinkedList is the best class to use.
     *
     *  Worst Usecase scenario: When our frequently used operation is retrieving elements from list,
     *  then LinkedList is the worst choice.
     *
     *
     *  7. Operation time complexity
     *      get(int index) is O(n) (with n/4 steps on average)
     *      add(E element) is O(1)
     *      add(int index, E element) is O(n) (with n/4 steps on average), but O(1) when index = 0 <--- main benefit of LinkedList<E>
     *      remove(int index) is O(n) (with n/4 steps on average)
     *      Iterator.remove() is O(1). <--- main benefit of LinkedList<E>
     *      ListIterator.add(E element) is O(1) This is one of the main benefits of LinkedList<E>
     */


    public static void main(String[] args) {

        LinkedList<Integer> numbersList = new LinkedList<>();
        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);
        numbersList.add(4);
        numbersList.add(5);

        System.out.println(numbersList.toString());

        numbersList.addFirst(0);
        System.out.println(numbersList.toString());

        numbersList.addLast(6);
        System.out.println(numbersList.toString());

        numbersList.removeFirst();
        numbersList.removeLast();
        System.out.println(numbersList.toString());

        numbersList.offerFirst(0);
        numbersList.offerLast(6);
        System.out.println(numbersList.toString());

    }



}
