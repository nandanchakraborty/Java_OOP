public class MotorBike{

    //class is like a template ,like what kind of data they have
// and what kind of action they can achieve.
    //and object is an instance of a template
    //in this section we will build some classes and their instance
//every obj has its state and behaviour

 private  int speed ;

    public int getSpeed() {
        return speed;
    }

    public int setSpeed(int speed) {
        this.speed = speed;

        return speed;
    }
    public void increaseSpeed(int howMuch){
        this.speed = this.speed +howMuch;
    }

    public void decreaseSpeed(int howMuch){
        this.speed = this.speed - howMuch;
        if(this.speed < 0){
            this.speed = 0;
        }
    }

    void start(){
    System.out.println("Bike started");

}
}
