package FunctionalPrograming;

import java.util.List;

public class FunctionalProgramingRunner {
    public static void main(String[]args){
        List<String> list = List.of("Apple","bat","cat");
        Printbasic(list);
        printWithFP(list);
        printWithFPWithFiltering(list);
    }

    private static void Printbasic(List<String> list) {
        for(String string : list){
            System.out.println(string);
        }
    }
    private static void printWithFP(List<String> list){
        list.stream().forEach(

                /*Stream API is a way to express and process collections of objects.
Enable us to perform operations like filtering, mapping, reducing, and sorting.


                 */element ->System.out.println(STR."element :\{element}"));
    }

    private static void printWithFPWithFiltering(List<String> list) {  list.stream()
                .filter(
                        element -> element.endsWith("at"))
                .forEach(
                        element->System.out.println(STR." filter element :\{element}"));

    }
}
