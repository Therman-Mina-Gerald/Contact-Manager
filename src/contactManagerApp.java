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
        scanner.nextLine();

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
        option0();
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
            option0();
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
        System.out.println(response);
        List<String> lines = Files.readAllLines(Paths.get("src","contacts.txt"));
        System.out.println(lines);
        for (String line : lines) {

            if (line.toLowerCase().contains(response)) {
                System.out.println(line);
                option0();
            }
        }
        System.out.println("Contact Not Found");
                        option3();
    }


        public static void option4 () throws IOException {
            System.out.println("Which contact would you like to delete?(WARNING:Changes are FINAL)");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            System.out.printf("Are you sure you want to delete %s [Y/N} " ,response);

           String userContinue = scanner.nextLine();
            if (userContinue.equalsIgnoreCase("y") || userContinue.equalsIgnoreCase("yes")) {
                System.out.println("Hey are we past the second if statement?");
                List<String> lines = Files.readAllLines(Paths.get("src", "contacts.txt"));
                List<String> deleteLine = new ArrayList<>();
                //lines = deleteLine ;
                for (String line : lines) {

                    if (line.toLowerCase().contains(response)) {
                       // lines.remove(line);
                        continue;

                    }
                    deleteLine.add(line);
                    System.out.println("deleteLine = " + deleteLine);

                    //lines = deleteLine;
//                    Files.write(Paths.get("src", "contacts.txt"), deleteLine);
//                    option1(Path.of(contactFile));


                }
                Files.write(Paths.get("src", "contacts.txt"), deleteLine);
                option1(Path.of(contactFile));
            }else{
                option0();
            }
;



        }
        ;
        public static void option5 () {
            System.out.println(" Thank you for using Contact App.\n Have a nice day");
            System.exit(0);

        }
        ;


        public static void main (String[]args) throws IOException {
            option0();
        }

}