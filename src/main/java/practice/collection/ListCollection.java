package practice.collection;

import java.util.*;

public class ListCollection {

    public static void main(String[] args) {

        /**
         * List sort method
         *
         */
        List<Integer> ints = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) ints.add(random.nextInt(1000));

        //natural sorting accending order
        Collections.sort(ints);
        System.out.println("Natural Sorting: "+ints);

        // custom sorting reverse order
        ints.sort((o1,o2) -> { return o2-o1; });
        System.out.println("Reverse Sorting: "+ints);


        /**
         *  Java List iterator
         *
         */
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<5; i++) list.add(i);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }


    }



}
