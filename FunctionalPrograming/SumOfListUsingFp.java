package FunctionalPrograming;

import java.util.List;

public class SumOfListUsingFp {
    public static void main(String[]args){
        List<Integer> list = List.of(1,2,3,4,5,6);
        sumWithFp(list);
        sumOfOddNumbers(list);


    }

    private static void sumOfOddNumbers(List<Integer> list) {
       int sum =  list.stream().filter(lists ->lists%2==0)
               .reduce(
     0,(lists1,lists2)->lists1 +lists2);
       System.out.println(sum);


    }

    private static void sumWithFp(List<Integer> list) {
        int sum = list.stream().reduce(
                0,(lists1,lists2)->lists1+lists2);
        System.out.println(sum);
        /*The Stream API provides a rich repertoire of intermediate, reduction and terminal functions, which also support parallelization.

More specifically, reduction stream operations allow us to produce one single result from a sequence of elements, by repeatedly applying a combining operation to the elements in the sequence.

In this tutorial, we’ll look at the general-purpose Stream.reduce() operation and see it in some concrete use cases.

Further reading:
Summing Numbers with Java Streams
A quick and practical guide to summing numbers with Java Stream API.
Read more →
Introduction to Java Streams
A quick and practical introduction to Java 8 Streams.
Read more →
Guide to Java BiFunction Interface
Learn some common patterns for Java functional interfaces that take two parameters.
Read more →
2. The Key Concepts: Identity, Accumulator and Combiner
Before we look deeper into using the Stream.reduce() operation, let’s break down the operation’s participant elements into separate blocks. That way, we’ll understand more easily the role that each one plays.

Identity – an element that is the initial value of the reduction operation and the default result if the stream is empty
Accumulator – a function that takes two parameters: a partial result of the reduction operation and the next element of the stream
Combiner – a function used to combine the partial result of the reduction operation when the reduction is parallelized or when there’s a mismatch between the types of the accumulator arguments and the types of the accumulator implementation
3. Using Stream.reduce()
To better understand the functionality of the identity, accumulator and combiner elements, let’s look at some basic examples:

List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
int result = numbers
  .stream()
  .reduce(0, (subtotal, element) -> subtotal + element);
assertThat(result).isEqualTo(21);

         */

    }

}
