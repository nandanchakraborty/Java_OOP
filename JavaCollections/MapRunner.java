package JavaCollections;

import java.util.HashMap;
import java.util.Map;


public class MapRunner {
    public static void main(String [] args){
        String str = "Today my result has been published and I got what I deserved";
        Map<Character ,Integer> occurance = new HashMap<>();
        char[] characters = str.toCharArray();
        for(char character : characters){
            Integer integers = occurance.get(character);
            if(integers == null){
                occurance.put(character,1);

            }
            else occurance.put(character,integers+1);


        }
        System.out.println(occurance);

        //now we will find the numbers of words in this string

        Map<String,Integer> stringOccurance = new HashMap<>();
        String[] words = str.split(" ");
        for(String word : words){
            Integer integers = stringOccurance.get(word);
            if(integers == null){
                stringOccurance.put(word,1);

            }
            else stringOccurance.put(word,integers+1);


        }
        System.out.println(stringOccurance);



    }
}
