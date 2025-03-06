public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

      //  ducati.speed = 100;
       // honda.speed = 80;
        //after some time their state may change

     //   ducati.speed = 20;
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

        System.out.println(ducati.setSpeed(100));
        honda.setSpeed(80);
        System.out.println();

}
}
