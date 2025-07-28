import java.util.*;

public class SetRunner {
    public static void main(String[]args){
        List<Character> character = List.of('A','Z','A','B','Z','F');
        //unique  - set
        //Tree set -- sorted set
        //linked hashset - insertion order set
        // hashset = unordered set

        Set<Character> treeSet = new TreeSet<>(character);
        System.out.println("treeSet : "+treeSet);

        Set<Character> linkedSet = new LinkedHashSet<>(character);
        System.out.println("LinkedSet : "+linkedSet);

        Set<Character> hashSet = new HashSet<>(character);
        System.out.println("HashSet : "+hashSet);


    }
}
