import java.nio.file.*;
import java.util.*;
import java.io.*;



public class contactManagerApp {

    public static final String ANSI_GREEN = "\u001B[32m";

    //   TODO
//    Show all your contacts  - done
//    Add a new contact
//    Search a contact by her name
//    Delete an existing contact

    // option 2 needed this variables
    public static String directory = "src";
    public static String contactFile = "src/contacts.txt";


    public static void printContact(Path filePath) throws IOException {
        System.out.println();
        List<String> fileContents = Files.readAllLines(filePath);
        //We need List as .readAllLines returns List datatype
        for (int i = 0; i < fileContents.size(); i++) {
            System.out.printf("%d: %s\n", i + 1, fileContents.get(i));
        }
    }




    public static void option0() throws IOException {
        Path pathToContact = Paths.get("src/contacts.txt");
        // printContact(pathToContact);

        //TODO
//        1. View contacts.
//        2. Add a new contact.
//        3. Search a contact by name.
//        4. Delete an existing contact.
//        5. Exit.
//                Enter an option (1, 2, 3, 4 or 5):
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your Contacts\nPlease choose from options \n1. View contacts.\n2. Add a new contact.\n3. Search a contact by name.\n4. Delete an existing contact.\n5. Exit.");

        int userPick = scanner.nextInt();

        //
        if (userPick == 1) {
            option1(pathToContact);

        } else if (userPick == 2) {
            option2();


        } else if (userPick == 3) {
            option3();

        } else if (userPick == 4) {
            option4();
        } else if (userPick == 5) {
            option5();
        } else {
            System.out.println("Please enter valid number.");
            option0();
        }


    }


    public static void option1(Path path) throws IOException {
        printContact(path);
    }

    public static void option2() throws IOException {
        System.out.println("Please enter the name and phone number you'd like to add (firstname lastname #**********)");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        System.out.printf("You entered: %s.\n Are you sure you want to add contact?[y/n]", response);
        List<String> contactList;

        Path dataDirectory = Paths.get(directory);
        Path dataDirectoryAndFile = Paths.get(directory, "contacts.txt");
        String responseTwo = scanner.nextLine();
        if (responseTwo.equalsIgnoreCase("y") || responseTwo.equalsIgnoreCase("yes")) {
            List<String> newContact = List.of(response);
//                System.out.println(response);
//                System.out.println(newContact);
//              Files.write(dataDirectoryAndFile,newContact);
            Files.write(dataDirectoryAndFile, newContact, StandardOpenOption.APPEND);
        } else {
            option0();
        }


/*if(Files.notExists(dataDirectoryAndFile)){
            Files.createDirectories(dataDirectory);

            Files.createFile(dataDirectoryAndFile);
        }*/
    }

    ;

    public static void option3() throws IOException {
        System.out.println("Enter contact name you are looking for.");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();

        Path dataDirectory = Paths.get(directory);
        Path dataDirectoryAndFile = Paths.get(directory, "contacts.txt");
        List<String> contactList = Files.readAllLines(dataDirectoryAndFile);
        System.out.println(contactList);
        for (int i = 0; i < contactList.size(); i++) {
            String result;
            if (contactList.get(i).toLowerCase().contains(response.toLowerCase())) {
                System.out.println(contactList.get(i));
            } else {
                System.out.println("Contact Not Found");
                option0();
            }
        }
        }


        public static void option4 () {
            System.out.println("Which contact would you like to delete?(WARNING:Changes are FINAL)");
        }
        ;
        public static void option5 () {

        }
        ;


        public static void main (String[]args) throws IOException {

    /*    Path pathToContact = Paths.get("src/contacts.txt");
        // printContact(pathToContact);

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

        }else if(userPick == 2){
            option2();


        }else if(userPick == 3){
            option3();

        }else if(userPick == 4){
            option4();
        }else if(userPick == 5){
            option5();
        }else {
            System.out.println("Please enter valid number.");
        }
*/

            option0();


        }

}