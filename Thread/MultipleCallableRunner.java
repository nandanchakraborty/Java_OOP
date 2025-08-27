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
        List<Future<String>> results = executorservice.invokeAll(task);
        for(Future<String> result: results){
            System.out.println(result.get());
        }


        executorservice.shutdown();
    }}