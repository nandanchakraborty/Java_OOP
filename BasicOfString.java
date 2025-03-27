public class BasicOfString {
    public static void main(String[] args) {
        String s = "This is a lot of text  string";
        System.out.println("string length " + s.length());
        // a specila word index /or searchig a word
        System.out.println("index of lot " + s.indexOf("lot"));
        System.out.println("searching a cahr " + s.indexOf('i'));
        //finding last occurance of a char
        System.out.println("last occurence of i " + s.lastIndexOf('I'));
        //other way
        System.out.println("other option" + s.contains("text"));
        //starts with specifin string
        System.out.println("special start "+ s.startsWith("this "));

        System.out.println("equals or not"+ s.equals("values"));
        
    }
}