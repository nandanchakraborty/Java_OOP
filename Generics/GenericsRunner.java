package Generics;

public class GenericsRunner {
    public static void main(String[] args){
        MyCustomList <String> list = new MyCustomList<>();

        list.addElement("element 1");
        list.addElement("element 2");
        list.addElement("element 3");

        String value = list.get(0);
        System.out.println(list);

        list.removeElement("element 1");
        System.out.println(list);

        System.out.println(value);
        MyCustomList <Integer> list2 = new MyCustomList<>();

        list2.addElement(2);
        list2.addElement(5);
        Integer num = list2.get(0);
        System.out.println(list2);
        System.out.println(num);

    }
}
