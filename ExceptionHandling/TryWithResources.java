package ExceptionHandling;

import java.util.Scanner;

public class TryWithResources {
    public static void main(String []args){
        try(Scanner sc = new Scanner(System.in)){ //in that try block,there is auto closeable call of that scanner
            //feature.This helps us in making our try catch blocks much more simpler.
            int []num ={1,3,5,3,6};
            int number = num[3];
        }
    }
}
