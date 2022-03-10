import java.nio.file.*;
import java.util.*;
import java.io.*;



public class contactManagerApp {


    //   TODO
//    Show all your contacts  - done
//    Add a new contact
//    Search a contact by her name
//    Delete an existing contact






    public static void printContact(Path filePath)throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        //We need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }

    public static void option1(Path path)throws IOException{
        printContact(path);
    }



    public static void main(String[] args) throws IOException {

        Path pathToContact = Paths.get("src/contacts.txt");
        printContact(pathToContact);

        //TODO
//        1. View contacts.
//        2. Add a new contact.
//        3. Search a contact by name.
//        4. Delete an existing contact.
//        5. Exit.
//                Enter an option (1, 2, 3, 4 or 5):
        Scanner scanner = new Scanner (System.in);
        System.out.println("Welcome to your Contacts\nPlease choose from options \n1. View contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.");

        int userPick = scanner.nextInt();

        //
        if(userPick == 1){
            option1(pathToContact);

        }









    }
}
