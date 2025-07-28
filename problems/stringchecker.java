package problems;

import java.util.Arrays;
import java.util.Scanner;

public class stringchecker {
    public static void func(String s1, String s2) {

        s1.toLowerCase();
        s2.toLowerCase();
        int n1 = s1.length();
        int n2 = s2.length();

        if(n1 != n2) System.out.println("Not anagram");
        else {
            char[] charArray1 = s1.toCharArray();
            char[] charArray2 = s2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if(Arrays.equals(charArray1, charArray2)) {
                System.out.println("Strings are anagram");

            }
            else {
                System.out.println("Not anagram");
            }


        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        str1 = sc.nextLine();
        str2 = sc.nextLine();

        func(str1, str2);

    }
}


