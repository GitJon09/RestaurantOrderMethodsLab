
import java.util.Scanner;

// Method to display the menu

public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Burger - $5.99");
        System.out.println("2. Pizza - $8.99");
        System.out.println("3. Salad - $4.99");
        System.out.println("4. Soda - $1.99");
    }
 
    // Method to get the price of an item based on selection
    public static double getItemPrice(int itemNumber) {
        // TODO: Implement logic to return the price based on itemNumber
if (itemNumber == 1) {
            return 5.99;
        } else if (itemNumber == 2) {
            return 8.99;
        } else if (itemNumber == 3) {
            return 4.99;
        } else if (itemNumber == 4) {
            return 1.99;
        } else {
            System.out.println("Invalid item number.");
            return 0.0; // Invalid item
        }
    }
 
    // Method to take an order from the user
    public static void takeOrder() {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;
        double discount = totalCost * 0.25; // 25% discount for demonstration
        
        System.out.println("Enter the item number to order (0 to finish): ");
        
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 0) break;
            
            // TODO: Call getItemPrice() and update totalCost
            totalCost += getItemPrice(choice);
            discount = totalCost * 0.25; // Update discount based on new total
        }
    
        // TODO: Display total cost
        totalCost = calculateTotal(totalCost);
        System.out.println("Total Cost: $" + totalCost);
        discount = calculateTotal(totalCost, discount);
        System.out.printf("Total Cost after discount: $%.2f%n", discount);
        
        scanner.close();
    }
 
    // Overloaded method to apply a discount
    public static double calculateTotal(double totalCost) {
        // TODO: Implement method to return total cost
        
        return totalCost;
    }
 
    public static double calculateTotal(double totalCost, double discount) {
        // TODO: Implement method to return total cost after discount
        totalCost -= discount;
        return totalCost;
    }
 
    // Main method to run the program
    public static void main(String[] args) {
        displayMenu();
        takeOrder();
    }
