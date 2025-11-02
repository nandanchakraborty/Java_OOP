package MyFiles;
//It's about reading a file in java .
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
    public static void main(String[] args) throws IOException {
        Path pathFileToRead = Paths.get("MyFiles/resources.txt");
       // List<String> lines = Files.readAllLines(pathFileToRead);//this will fetch all the line in a list and
        // put in on memory at a time.there is an alternative way:
        //System.out.println(lines);
        Files.lines(pathFileToRead).filter(str->str.contains("a"))
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
