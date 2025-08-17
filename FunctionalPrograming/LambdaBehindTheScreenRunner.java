package FunctionalPrograming;

import java.util.function.Predicate;
import java.util.stream.Stream;
class EvenNumberPredicate implements Predicate<Integer> {

    public boolean test(Integer number) {


        return number % 2 == 0;
    }
    public static class LambdaBehindTheScreenRunner {
        public static void main(String[] args) {
            Stream.of(12, 23, 34, 45, 55, 56).filter(n -> n % 2 == 0).
                    forEach(System.out::println);

            Stream.of(12, 23, 34, 45, 55, 56).filter(new EvenNumberPredicate()).
                    forEach(System.out::println);


        }
    }
}

/*

 */