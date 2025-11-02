package Concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BicounterWithAtomicInteger {

  private AtomicInteger i =  new AtomicInteger();
   private  AtomicInteger j  = new AtomicInteger();
     public  void incrementI(){

         i.incrementAndGet();

    }
    public int  getI(){

         return i.get();
    }

     public void incrementJ(){
         j.incrementAndGet();
    }

    /**
     * @return
     */
    public int getJ(){

        return j.get();
    }

    public static void main(String[]args){

        BicounterWithAtomicInteger b = new BicounterWithAtomicInteger();
        b.incrementI();
        b.incrementJ();
        System.out.println("get i :"+b.getI()+",  get j :"+b.getJ());    }
}
