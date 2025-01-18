package advanced.fileProcessing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*
Read a file line by line and filter out lines that contain a specific keyword.
Input: File with lines:

Output: ["ERROR: Disk full", "ERROR: Out of memory"]

 */
public class FileProcessing {
    public static void main(String[] args)  {
        Path filePath = Paths.get("src/advanced/fileProcessing/input.txt");
        String keyword = "ERROR";

        try {
            List<String> filteredList = Files.lines(filePath)
                    .filter(txt -> txt.contains(keyword))
                    .toList();
            System.out.println(filteredList);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
