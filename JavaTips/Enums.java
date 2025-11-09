package JavaTips;

public class Enums {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[]args){
        Level myLvl = Level.MEDIUM;
       // System.out.println(myLvl);
        switch(myLvl){
            case LOW:
                System.out.println("low level");
                break;

            case MEDIUM:
                System.out.println("medium level");
                break;

            case HIGH:
                System.out.println("high level");
                break;

        }
    }
}
