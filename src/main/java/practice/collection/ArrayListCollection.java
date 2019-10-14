package practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListCollection {

    /**
     * 1. In Arraylist insertion and deletion on middle indexes are costly because After after insertion and deletion
     * it adjust the later elements
     *
     * 2. even the insertion in the end is also costly sometimes because it re-adjust it's size by creating a new array
     * with double it's previous size and move all the elements.
     *
     * 3. if you know the size of arrayList then it's better if you create the arrayList with proper size in the first place.
     *      List<Integer> list =  new ArrayList<Integer>(Size of araayList);
     *
     * 4. accessing the element by index is faster in arraylist.
     *
     * 5. arrayList update operation can done using set operation.
     *      list.set(2,"aryan")
     *
     * 6. ArrayList Operation complexity:
     *      get(int index) is O(1) <--- main benefit of ArrayList<E>
     *      add(E element) is O(1) amortized, but O(n) worst-case since the array must be resized and copied
     *      add(int index, E element) is O(n) (with n/2 steps on average)
     *      remove(int index) is O(n) (with n/2 steps on average)
     *      Iterator.remove() is O(n) (with n/2 steps on average)
     *      ListIterator.add(E element) is O(n) (with n/2 steps on average)
     *      set(int index, <new element>) - 0(1)
     *
     */

    public static void main(String[] args) {
        List<String> letters = new ArrayList<String>();

        //add example
        letters.add("A");
        letters.add("C");
        letters.add("D");

        //let's insert B between A and C
        letters.add(1,"B");
        System.out.println(letters);

        // let's update B with BB
        letters.set(1,"BB");
        System.out.println(letters);

        // foreach in arraylist
        letters.forEach(x -> {
            System.out.println(x);
        });


        // sort arraylist
        Collections.sort(letters);
        // OR
        letters.sort((o1, o2) -> {return o1.compareTo(o2);});

        // create arrayList with specific length
        List<String> list1 = new ArrayList<String>(1000);


        //---------------------------------------------------------------------------------------------
        // CuncurrentModification Exception in list iterator.
        List<Integer> ints = new ArrayList<>();
        for(int i=0; i<10; i++) ints.add(i);

        Iterator<Integer> it = ints.iterator();

        //simple iteration
        while(it.hasNext()){
            int x = (int) it.next();
            System.out.print(x + ", ");
        }
        System.out.println("\n"+ints);

        //modification of list through iterator
        it = ints.iterator();
        while(it.hasNext()){
            int x = (int) it.next();
            if(x%2 ==0) it.remove();
        }
        System.out.println(ints);

        //changing list structure while iterating
        it = ints.iterator();
        while(it.hasNext()){
            int x = (int) it.next();
            //*******ConcurrentModificationException here
            if(x==5) ints.add(20);
        }


        /**
         * For multi threaded code. ArrayList is not safe so it's better if you create synchronized
         * Thread safe list
         *  Collections.synchronizedList
         */
        List<Integer> syncList = Collections.synchronizedList(ints);



    }
}
