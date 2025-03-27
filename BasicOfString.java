public class BasicOfString {
    public static void main(String[] args) {
        String s = "This is a lot of text  string ";
        System.out.println("string length : " + s.length());
        // a specila word index /or searchig a word
        System.out.println("index of lot : " + s.indexOf("lot"));
        System.out.println("searching of char 'i' :" + s.indexOf('i'));
        //finding last occurance of a char
        System.out.println("last occurence of i :" + s.lastIndexOf('i'));
        //other way
        System.out.println("other option :" + s.contains("text"));
        //starts with specifin string
        System.out.println("special start  :"+ s.startsWith("this "));

        System.out.println("equals or not :"+ s.equals("values"));

        //string concat
      String str=  s.concat(" to practiceing string methods");
   //so we know string in immutable
        System.out.println("original string : "+s);
        System.out.println("concat string  :"+str);


        System.out.println("to lower case :"+str.toLowerCase());
        System.out.println("to upper case :"+str.toUpperCase());


    }
}