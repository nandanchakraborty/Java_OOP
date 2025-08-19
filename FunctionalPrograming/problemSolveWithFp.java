package FunctionalPrograming;

import java.util.List;
import java.util.stream.Collectors;

public class problemSolveWithFp {

    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        if(courses == null) {
            return List.of();
        }

       return courses.stream().map(String :: length ).
               collect(Collectors.toList());

    }


    public static void main(String[]args){
       List<String> ls =  List.of("math","english","economics","physics");

      List<Integer> list =   getCourseNameCharacterCount(ls);
      System.out.println(list);

      List<Integer> l = List.of(1,2,3,4,5);

      int n = sumOfSquare(l);
      System.out.println(n);
    }

    private static int sumOfSquare(List<Integer> l) {
        if( l == null)
            return 0;

        return Math.toIntExact(l.stream().mapToLong(n -> n * n).sum());
    }
}

/*this is a basic problem solve with fp
a string list to count the number of alphabets in a word
 */
