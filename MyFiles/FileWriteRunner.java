package MyFiles;
//It's about writing a file in java .
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[] args) throws IOException {
        Path pathFileToWrite = Paths.get("MyFiles/file_write.txt");
        List<String> list = List.of("Apple","Ball","cat","doll","elephant");
        Files.write(pathFileToWrite,list);

    }
}
