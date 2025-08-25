package Thread;

//Controlling thread by Executor service.
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Task extends Thread{
    private  int number;

    Task(int num){
        this.number = num;
    }
    public void run(){//signature
        System.out.println("task"+ number +" started");

        for(int i = number*100; i<= number*100 + 99 ; i++){
            System.out.print(i + " ");
        }
        System.out.println("task"+ number +" done");




    }

}

public class ExecutorServiceRunner {
    

    public static void main(String[]args) {
       // 1. ExecutorService executorservice = Executors.newSingleThreadExecutor();  // this is a single thread executor
        ExecutorService executorservice = Executors.newFixedThreadPool(3); //this is a multiple thread executor

        //executorservice.execute(new Task1()); #1
        //executorservice.execute(new Task2()); #1

        executorservice.execute(new Task(1));
        executorservice.execute(new Task(2));

        executorservice.execute(new Task(3));

        executorservice.execute(new Task(4));

        executorservice.execute(new Task(5));





        executorservice.shutdown();
    }
}
