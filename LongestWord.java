import java.util.Scanner;

public class LongestWord {
    public static String findLongestWord(String s){
        if(s== null || s.equals (" ")){
            return " ";
        }
        String regex = "[,\\s\\.]";
        String [] words =  s.split(regex);

        int maxLength = 0;
        String longestword = " "    ;
        for   (String  word : words){
            System.out.println(word);
        if(word.length() > maxLength) {

            maxLength = word.length();
            longestword = word;

        }
        }

        return longestword;
    }


    public static void main(String [] args){
        System.out.println("enter a string");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String p = findLongestWord(s)  ;
        System.out.println("longest word is  :  " +p);
    }}
