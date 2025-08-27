package Thread;

import java.util.concurrent.*;


class CallableTask implements Callable<String>{
    private String name;
    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "hello  "+name;
    }
}
public class CallableRunner {
    public static void main(String[]args) throws ExecutionException, InterruptedException {
        ExecutorService executorservice = Executors.newFixedThreadPool(1); //this is a multiple thread executor
      Future<String> welcomeFuture = executorservice.submit(new CallableTask("Nandan"));

      System.out.println("CallableTask(\"Nandan\")) executed");

      String welcomeMessage = welcomeFuture.get();

      System.out.println(welcomeMessage);
        System.out.println("main completed");

        executorservice.shutdown();



    }


}
