import java.util.Scanner;

public class Warehouse {
    private Inventory inventory;
    private Scanner scanner;

    public Warehouse() {
        this.inventory = new Inventory();
        this.scanner = new Scanner(System.in);
    }

    public void mainFunction() {
        while (true) {
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Update quantity");
            System.out.println("4. Search item by ID");
            System.out.println("5. Search item by name");
            System.out.println("6. Display all items");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 

            switch (option) {
                case 1:
                    additem();
                    break;
                case 2:
                    removeitem();
                    break;
                case 3:
                    updatequantity();
                    break;
                case 4:
                    searchitembyid();
                    break;
                case 5:
                    searchitembyname();
                    break;
                case 6:
                    inventory.displayallitems();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private void additem() {
        System.out.print("Enter item ID: ");
        String itemId = scanner.nextLine();
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); 

        Item item = new Item(itemId, itemName, quantity, price);
        inventory.additem(item);
        System.out.println("Item added successfully!");
    }

    private void removeitem() {
        System.out.print("Enter item ID: ");
        String itemId = scanner.nextLine();
        inventory.removeitem(itemId);
        System.out.println("Item removed successfully!");
    }

    private void updatequantity() {
        System.out.print("Enter item ID: ");
        String itemId = scanner.nextLine();
        System.out.print("Enter new quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        inventory.updatequantity(itemId, quantity);
        System.out.println("Quantity updated successfully!");
    }

    private void searchitembyid() {
        System.out.print("Enter item ID: ");
        String itemId = scanner.nextLine();
        Item item = inventory.searchitembyid(itemId);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item not found!");
        }
    }

    
    private void searchitembyname() {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        Item item = inventory.searchitembyname(itemName);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Item not found!");
        }
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.mainFunction();
    }
}