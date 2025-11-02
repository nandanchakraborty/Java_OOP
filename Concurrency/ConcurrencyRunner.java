package Concurrency;


public class ConcurrencyRunner {
    public static void main(String[]args){
        Counter counter = new Counter();
        counter.increment();
        counter.get();

    }
}
