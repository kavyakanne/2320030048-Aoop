package furniture;

import java.util.Scanner; 

public class FurnitureApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        FurnitureFactory factory;

        while (true) {
            System.out.println("Enter the style of furniture you want (Modern/Victorian) or 'exit' to quit:");
            String style = scanner.nextLine().toLowerCase();

            if (style.equals("exit")) {
                break;
            }

            switch (style) {
                case "modern":
                    factory = new ModernFurnitureFactory();
                    break;
                case "victorian":
                    factory = new VictorianFurnitureFactory();
                    break;
                default:
                    System.out.println("Invalid style. Please try again.");
                    continue;
            }

            Chair chair = factory.createChair();
            Table table = factory.createTable();

            System.out.println("Created a " + chair.getStyle() + " chair");
            System.out.println("Created a " + table.getStyle() + " table");
        }

        scanner.close();
        System.out.println("Thank you for using the Furniture Factory!");
    }

	}


