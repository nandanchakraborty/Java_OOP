public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
     //   honda.speed = 10;
        //here this class is directly accessing the internal variables
        //of other class.which break encapsulation  process.that mean other class
        // should not change data directly of other class
        //so all the modification to the data of a object should be
        //through the methods of that specific obj.
        //we can fix this by making a variable private.then u cant access
        //these variable outsides of the class.when making a method remember about
        // input,output,name

        //Now we can access speed through method


    /*   so this is the manuel form of increasing the speed
      we can easily do it by making a method; watch the MotorBike class

       { int ducatiSpeed = ducati.getSpeed();//get ducati speed
        ducatiSpeed = ducatiSpeed + 100;//increase it
        ducati.setSpeed(ducatiSpeed);//set it to ducati
       System.out.println(ducati.getSpeed());}

     */
        ducati.increaseSpeed(100);
        ducati.decreaseSpeed(200);
        honda.increaseSpeed(80);
        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

    }
}
