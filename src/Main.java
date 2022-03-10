import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;





public class Main {
/*
//TODO
  1//  Load all of the contacts by calling a method that returns a List of Contact objects.
  2//  Call a method that shows the user the main menu and returns their choice of action.
  3//  Using the user's choice from the previous step, call a method that performs that action (modifying the contents of the List of Contact objects if applicable).
  4// Keep calling the method from step two until the user chooses to exit.
  5//  Once the user chooses to exit, re-write the contents of the contacts.txt file using the List of Contact objects.
*/

    public  static Scanner scanner = new Scanner(System.in);

    public static void printContact(Path filePath) throws IOException {
      System.out.println();
      List<String> fileContents = Files.readAllLines(filePath);
                       //We need List as .readAllLines returns List datatype
      for (int i = 0; i < fileContents.size(); i++) {
          System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
      }




  }
}

