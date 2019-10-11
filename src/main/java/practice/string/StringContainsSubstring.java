package practice.string;

import java.util.Scanner;

public class StringContainsSubstring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first Line :");
        String str1 =  scanner.nextLine();

        System.out.println("Enter second string :");
        String str2 = scanner.nextLine();
        scanner.close();
        if(str1.contains(str2)) System.out.println("True");
        else System.out.println("False");


    }


}
