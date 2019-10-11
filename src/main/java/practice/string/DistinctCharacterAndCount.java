package practice.string;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacterAndCount {

    private static Map getDistinctCharacterAndCount(String str){
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        char[] chars = str.toCharArray();

        for( char c : chars){
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        return map;
    }

    public static void main(String[] args){

        String str1 = "aaasddfvccvbgff";
        String str2 = new String("dszxmhjgfcvmkjgfcvbnvbnmj");
        String str3 = "aaabb";

        Map<Character,Integer> map = getDistinctCharacterAndCount(str2);

        map.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));



    }


}
