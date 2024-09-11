package dsa.Exercitii.Map;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedMap<String, List<String>> phoneBook = new TreeMap<>();
        String name;
        String phoneNumber;
        while (true) {
            System.out.println("\nPhone book system:");
            System.out.println("1. Add contact:");
            System.out.println("2. Remove contact:");
            System.out.println("3. Search contact:");
            System.out.println("4. Display all contacts:");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter contact number: ");
                    phoneNumber = scanner.nextLine();

                    if (phoneBook.containsKey(name)) {
                        phoneBook.get(name).add(phoneNumber);
                    } else {
                        List<String> contactNumbers = new ArrayList<>();
                        contactNumbers.add(phoneNumber);
                        phoneBook.put(name, contactNumbers);
                    }
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    System.out.print("Enter contact to remove: ");
                    name=scanner.nextLine();
                    if (phoneBook.containsKey(name)){
                        phoneBook.remove(name);
                        System.out.println("Contact removed successfully!");
                    } else {
                        System.out.println("Contact not fount!");
                    }
                    break;
                case 3:
                    System.out.print("Enter contact to update: ");
                    name=scanner.nextLine();
                    if (phoneBook.containsKey(name)){
                        System.out.println("Contact found successfully: " + phoneBook.get(name));
                    } else {
                        System.out.println("Contact not fount!");
                    }
                    break;
                case 4:
                    System.out.println("Contacts: ");
                    for (Map.Entry<String, List<String>> it : phoneBook.entrySet()) {
                        System.out.println(it.getKey() + " : " + it.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Exiting peogram...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Try again from 1 to 5.");
            }
        }
    }
}
