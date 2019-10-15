package practice.collection;


import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * 1. Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
 *
 * 2. Java TreeMap contains only unique elements.
 *
 * 3. Java TreeMap cannot have a null key but can have multiple null values.
 *
 * 4. Java TreeMap is non synchronized.
 *
 * 5. Java TreeMap maintains ascending order key.
 *
 * 6. Since TreeMap stores entries in sorted way, it’s a bit slower that HashMap in storing and retrieving objects.
 *
 * 7. TreeMap uses Red-Black tree based NavigableMap implementation
 *
 * 8. if you have some special requirements related to sorting, finding next lower and higher key,
 * work on a submap then you can go for TreeMap.
 *
 * 9. TreeSet is basically implementation of a self-balancing binary search tree like Red-Black Tree.
 * Therefore operations like add, remove and search take O(Log n) time. And operations like printing n elements
 * in sorted order takes O(n) time.
 *
 */
public class TreeMapCollection {

    public static void main(String[] args) {

        Map<Integer,String> map = new TreeMap<>();

        map.put(10, "10");
        map.put(1, "1");
        map.put(5, "5");

        System.out.println(map);

        map = new TreeMap<>(new Comparator<Integer>() {

            @Override
            public int compare(Integer x, Integer y) {
                return (x > y) ? -1 : ((x == y) ? 0 : 1);
            }

        });
        map.put(10, "10");
        map.put(1, "1");
        map.put(5, "5");
        System.out.println(map);



        // when to use Tree treeMap
        //we have to define object as TreeMap to use NavigableMap functions
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        for(int i=0;i<10;i++) {
            treeMap.put(i, i+"");
        }

        System.out.println(treeMap);

        //find id closest to 5, lower and higher
        Map.Entry<Integer,String> entry = treeMap.lowerEntry(5);
        System.out.println("Closest Lower key than 5 is "+entry);
        entry = treeMap.higherEntry(5);
        System.out.println("Closest Higher key than 5 is "+entry);

        System.out.println("Closest Lower key than 4 is "+treeMap.lowerKey(4));

        entry = treeMap.floorEntry(5);
        System.out.println("Closest floor entry than 5 is "+entry);

        entry = treeMap.ceilingEntry(4);
        System.out.println("Closest ceiling key than 4 is "+entry);

        entry = treeMap.firstEntry();
        System.out.println("First Entry is "+entry);

        entry = treeMap.lastEntry();
        System.out.println("Last Entry is "+entry);

        Map<Integer, String> reversedMap = treeMap.descendingMap();
        System.out.println("Reversed Map: "+reversedMap);

        //poll and remove first, last entries
        entry = treeMap.pollFirstEntry();
        System.out.println("First Entry is "+entry);
        entry = treeMap.pollLastEntry();
        System.out.println("Last Entry is "+entry);
        System.out.println("Updated Map: "+treeMap);

        //submap example
        Map<Integer, String> subMap = treeMap.subMap(2, true, 6, true);
        System.out.println("Submap: "+subMap);

        subMap = treeMap.headMap(5, true);
        System.out.println("HeadMap: "+subMap);

        subMap = treeMap.tailMap(5, true);
        System.out.println("TailMap: "+subMap);



    }

}
