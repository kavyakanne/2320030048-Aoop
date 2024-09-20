package bookstore;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many books do you want to add?");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("Enter details for book " + (i + 1));

            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine(); 

            Book book = new Book(title, author, price, year);
            inventory.addBook(book);
        }
        System.out.println("\nInventory (unsorted):");
        inventory.printInventory();
        
        System.out.println("\nHow would you like to sort the inventory?");
        System.out.println("1: By Title (default)");
        System.out.println("2: By Author");
        System.out.println("3: By Price");

        int sortOption = scanner.nextInt();

        switch (sortOption) {
            case 1:
                Collections.sort(inventory.getBooks());
                System.out.println("\nInventory (sorted by title):");
                break;
            case 2:
                Collections.sort(inventory.getBooks(), new Author());
                System.out.println("\nInventory (sorted by author):");
                break;
            case 3:
                Collections.sort(inventory.getBooks(), new Price());
                System.out.println("\nInventory (sorted by price):");
                break;
            default:
                System.out.println("Invalid option. Showing unsorted inventory.");
                break;
        }

        inventory.printInventory();
        System.out.println("\nWould you like to clone the first book? (yes/no)");
        scanner.nextLine(); 
        String cloneOption = scanner.nextLine();

        if (cloneOption.equalsIgnoreCase("yes") && !inventory.getBooks().isEmpty()) {
            Book clonedBook = inventory.getBooks().get(0).clone();
            System.out.println("Cloned Book: " + clonedBook);
        }

        scanner.close();
    }
}
