package MultiThreads;


    /*
     Ways of implementing threads :
    1.extends
    2.Implements Runnable
     */
     class Task1  extends Thread{
        public void run(){//SIGNATURE
            System.out.println("task 1 started");
            for(int i=100; i<= 199; i++){
                System.out.print(i+" ");

            }
            System.out.println("task 1 done");

        }
    }

    //implementing a Runnable interface
    class Task2 implements Runnable{

        @Override
        public void run() {
            System.out.println("task 2 started");
            for(int i=200; i<= 299; i++){
                System.out.print(i+" ");

            }
            System.out.println("task 2 done");



        }
    }
public class ThreadsRunner {
    public static void main(String[] args) throws InterruptedException {

        //now run the task 1
        Task1 task = new Task1();
        task.setPriority(10); //req for giving priority to thread task1
        task.start(); //not task.run() ,it will work like typical program.see the magic in the output

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();


      /*  System.out.println("task 2 started");
        for(int i=200; i<= 299; i++){
            System.out.print(i+" ");

        }
        System.out.println("task 2 done");

       */
/*
These main method loop run is typical rules to run a program.first the 1st will be done,then the others one by one.
For these the cpu will wait for  done the first one then the second will start.to avoid this queue comes thread.
thread will allow u to run more than one task parallel way.
 */
        task.join();//throws this InterruptedException  and when the task1 will finish then task3 will start
        System.out.println("task 3 started");
        for(int i=300; i<= 399; i++){
            System.out.print(i+" ");

        }
        System.out.println("task 3 done");

        System.out.println("main done");



    }
    //some important words
    //new -- created an instance but not running
    //runnable-- ready to run
    //running
    //blocked - when a thread is running sudden need other thread info to execute its part
    //terminated
}
