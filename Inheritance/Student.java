package Inheritance;

public class Student extends Person {
    /*here extending the person class ,now i can use everything that person can has.
   its called avoiding duplication.in Student class ,student also required the name,email,
    phone number,but i can now easily use it by extending Person class,

    But in this,if we did not extend person,in java ,automatically every class extend object.so this
    class will extend object

    here it is : public class Object
    Class  Object is the root of the class hierarchy. Every class has Object as a superclass.
    All objects, including arrays, implement the methods of this class.

    */
    private int year;
    private String homeAddress;

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
