package practice.collection;

import java.util.*;

public class HashSetCollection {

    public static void main(String[] args) {

        /**
         *  1. it doesn't contain duplicate element and also doesn't maintain insertion order.
         *
         *  2. it doesn't sort element by default.
         *
         *  3. Default initial capacity is 16 and default load factor is 0.75.
         *
         *  4. internally Hashset is Hashmap, hashset(value) is hashmap(key). hashmap(value) is constant assigned by JVM.
         *
         *  5. Time complexity
         *      add, remove, contain - 0(1)
         *      next - 0(h/n)
         *
         *
         */

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");

        set.contains("apple");
        set.remove("apple");

        for (String str : set) {
            System.out.println(str);
        }


        /**
         *  Hashset also throws exception while iterating using iterator if we change the hashset structure.
         *
         */
        Set<String> fruits = new HashSet<>();

        //add example
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println("Processing " + fruit);

            //wrong way of removing from Set, can throw java.util.ConcurrentModificationException
          //  if ("Orange".equals(fruit)) fruits.remove("Orange");
        }


        /**
         *  HashSet works on equals and Hashcode method.
         *  os if we are putting some custom object in HashSet, make sure to define equals and hashcode mothod in the
         *  custom object.
         *
         */

        Set<Emp> emps = new HashSet<>();
        emps.add(new Emp(1,"Pankaj"));
        emps.add(new Emp(2, "David"));
        emps.add(new Emp(1, "Pankaj"));

        System.out.println(emps);


        /**
         *  create synchronized hashset
         *
         */

        Set<String> synchronizedSet = Collections.synchronizedSet(new HashSet<>());


        /** very very important
         *
         * Notice that HashSet was able to check for duplicate when we tried to add an element. But we can change
         * the object values using setter methods and make it duplicate. It worked because there is no operation
         * done on Set. This is why Immutable objects works better with Set and Map.
         *
         *
         */

        Set<Emp> empHashSet = new HashSet<>();
        Emp emp =new Emp(1,"Pankaj");
        empHashSet.add(emp);
        empHashSet.add(new Emp(2, "David"));
        empHashSet.add(new Emp(1, "Pankaj"));

        System.out.println(empHashSet);

        Emp e = new Emp(3, "Lisa");
        Emp e1 = new Emp(3, "Lisa");
        empHashSet.add(e);
        System.out.println(empHashSet);

        //set values to make it duplicate
        e.setId(1);
        System.out.println(empHashSet);
        e.setName("Pankaj");
        System.out.println(empHashSet);

//        e.setId(3);
//        System.out.println(empHashSet);
//        e.setName("Lisa");

        empHashSet.remove(e);
        System.out.println(empHashSet);

        Iterator<Emp> itr = empHashSet.iterator();
        while (itr.hasNext()){
            if(itr.next().getName().equals("Pankaj")){
                System.out.println("ata");
                itr.remove();
            }
        }

        System.out.println(empHashSet);
    }


}


class Emp {
    private String name;
    private int id;

    public Emp( int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id &&
                Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}