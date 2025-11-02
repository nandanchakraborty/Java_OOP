package Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BicounterWithLock {
    int i = 0,j=0;
    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();
     public  void incrementI(){
         lockForI.lock();
         i++;
         lockForI.unlock();
    }
    public int  getI(){
        return i;
    }

     public void incrementJ(){
         lockForJ.lock();
        j++;
        lockForJ.unlock();
    }

    /**
     * @return
     */
    public int getJ(){
         return j;
    }

    public static void main(String[]args){
        BicounterWithLock bi = new BicounterWithLock();
        bi.incrementI();
        bi.incrementJ();
        bi.incrementI();
        bi.incrementJ();
        bi.getI();
        bi.getJ();
        System.out.println(bi.getI());
    }
}
