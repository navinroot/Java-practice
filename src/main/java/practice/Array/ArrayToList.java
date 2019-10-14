package practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

    public static void main(String[] args) {

        String[] vowels = {"a","e","i","o","u"};
        List<String> vowelsList = new ArrayList();

        /**
         * vowelsList=  Arrays.asList(vowels);
         * Here Array.asList doesn't support modification in Arraylist being created
         * So better try try to create it using add method
         *
         */

        for (String c :  vowels){
            vowelsList.add(c);
        }


        System.out.println(vowelsList);

        vowelsList.remove("e");
      //  vowelsList.clear();


        System.out.println(vowelsList);
    }

}
