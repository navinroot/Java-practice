package practice.string;

public class ReverseString {

    private static String reverseString( String str){
        StringBuilder strb= new StringBuilder(str);
        return strb.reverse().toString();
    }

    public static void main(String[] args) {

        String str1 = "navin";
        String str2 = new String("aryan");
        String str3 = "kumar";

        System.out.println(reverseString(str1));

    }

}
