package Contacts;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.nio.file.StandardOpenOption.APPEND;

public class ContactsManagerRunner {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path pathFileToRead = Paths.get("src", "Contacts", "contacts.txt");
        Path pathFileToWrite = Paths.get("/Users/michaelkestler/IdeaProjects/codeup-java-exercises/src/Contacts/contacts.txt");

        //            List<String> lines = Files.readAllLines(pathFileToRead);
//            System.out.println(lines);

//        Files.lines(pathFileToRead)
////                .map(String::toLowerCase)
////                .filter(str -> str.contains("a"))
//                .forEach(System.out::println);

        System.out.println("1. View Contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact");
        System.out.println("5. Exit.");
        System.out.println("(Enter an option 1, 2, 3, 4, or 5): ");
        int chooseOperation = scanner.nextInt();
//        display contact
        if (chooseOperation == 1) {
//            Files.lines(pathFileToRead)
//                    .forEach(System.out::println);
//            String leftAlignFormat = "| %-15s | %-15d |%n";

            System.out.format("+-----------------+-----------------+%n");
            System.out.format("| Name            | Phone Number    |%n");
            System.out.format("+-----------------+-----------------+%n");
            Files.lines(pathFileToRead)
                    .forEach(System.out::println);
//            Scanner s = new Scanner(new File("/Users/michaelkestler/IdeaProjects/codeup-java-exercises/src/Contacts/contacts.txt"));
//            ArrayList<String> list = new ArrayList<>();
//            while (s.hasNext()){
//                list.add(s.next());
//            }
//            s.close();

//            List<String> list = Files.readAllLines(new File("/Users/michaelkestler/IdeaProjects/codeup-java-exercises" +
//                    "/src/Contacts/contacts.txt").toPath(), Charset.defaultCharset() );
//            System.out.println(list);
//            for (int i = 0; i < 5; i++) {
//                System.out.format(leftAlignFormat, "some data" + i, i * i);
//            }
            System.out.format("+-----------------+------------------+%n");

            //user can add a contact
        } else if (chooseOperation == 2) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter name and phone number:");
            String newContact = scanner1.nextLine();
//            List<String> list =
//                    List.of(newContact);
            Files.write(pathFileToWrite,
                    List.of(newContact),
                    StandardOpenOption.APPEND
            );
            System.out.println("File updated as follows...");
            Files.lines(pathFileToRead)
                    .forEach(System.out::println);
            ;
        } else if (chooseOperation == 3) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter name");
            String searchContact = scanner2.nextLine();
            FileSearch fileSearch = new FileSearch();
            fileSearch.parseFile("/Users/michaelkestler/IdeaProjects/codeup-java-exercises/src/Contacts/contacts.txt"
                    , searchContact);
        }else if (chooseOperation == 4){
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Enter name");
            String stringToDelete = scanner3.nextLine();
            File file = new File("/Users/michaelkestler/IdeaProjects/codeup-java-exercises/src/Contacts/contacts.txt");
            List<String> out = Files.lines(file.toPath())
                    .filter(line -> !line.contains(stringToDelete))
                    .collect(Collectors.toList());
            Files.write(file.toPath(), out, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
                            }
            }


                }







