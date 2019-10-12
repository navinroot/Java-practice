package practice.string;

public class FirstNonRepeatingCharacter {

    private static void nonRepeatingCharacter( String str){
        int index =256;
        char[] chars = new char[index];

        for (char c : str.toCharArray()){
            chars[c] +=1;
        }
        for(char c : str.toCharArray()){
            if(chars[c] ==1){
                System.out.println(c);
                break;
            }
        }

    }

    public static void main(String[] args) {

            nonRepeatingCharacter("navin");

    }



}
