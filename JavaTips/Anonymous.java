package JavaTips;
class Animal {
    public void makeSound(){
        System.out.println("animal sound");
    }
}
public class Anonymous {
    public static void main(String[] args){
        Animal animal = new Animal(){
            public void makeSound(){
                System.out.println("woof woof");

            }
        };
        animal.makeSound();
    }
}
/*
An anonymous class is a class without a name. It is created and used at the same time.

You often use anonymous classes to override methods of an existing class or
interface, without writing a separate class file.

Here, we create an anonymous class that extends another class and overrides its method:
 */