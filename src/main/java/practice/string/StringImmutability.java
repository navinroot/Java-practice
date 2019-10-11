package practice.string;

public class StringImmutability {

    public static void main(String[] args) {

        String s1 = "java";

        String s2 = s1;

        s1 = "Python";

        System.out.println(s1);
        System.out.println(s2);



    }
}
