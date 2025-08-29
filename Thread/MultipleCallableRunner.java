package Thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorservice = Executors.newFixedThreadPool(3); //this is a multiple thread executor

        List<CallableTask> task = List.of(new CallableTask("Nandan"), new CallableTask("Pranta"),
                new CallableTask("MUMU"));
       // List<Future<String>> results = executorservice.invokeAll(task); //this is for all thread to run at the same time

        String result = executorservice.invokeAny(task);//this will do any thread to run at a single time

            System.out.println(result);



        executorservice.shutdown();
    }}