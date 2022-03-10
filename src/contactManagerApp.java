import java.nio.file.*;
import java.util.*;
import java.io.*;



public class contactManagerApp {
    Scanner scanner = new Scanner(System.in);
   // String contactFile = "contacts.txt";

    public static void printContact(Path filePath)throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        //We need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }



    public static void main(String[] args) throws IOException {

        Path pathToContact = Paths.get("src/contacts.txt");
        printContact(pathToContact);




    }
}
