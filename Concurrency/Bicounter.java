package Concurrency;

public class Bicounter {
    int i = 0,j=0;
    synchronized public  void incrementI(){

        i++;
    }
    public int  getI(){

        return i;
    }

    synchronized public void incrementJ(){
        j++;
    }
    public int getJ(){
        return j;
    }

    public static void main(String[]args){

        Bicounter bicounter = new Bicounter();
        bicounter.incrementI();
        bicounter.incrementJ();

        bicounter.getI();
        bicounter.getJ();
    }
}
