package Inheritance;

public class StudentRunner {
    public static void main(String []args){
        Student student = new Student();
        Person person = new Person();
        student.setName("Nandan");
        student.setEmail("practicing_inheritache@gmail.com");
        System.out.println(student);
        System.out.println(person);
    }
}
