import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args) {
        String item;
        double price;
        int quantity;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What item would you like to buy? ");
        item = scanner.nextLine();
        System.out.println("what is the price for each? ");
        price = scanner.nextDouble();
        System.out.println("How many would you like? ");
        quantity = scanner.nextInt();

        double total = price * quantity;

        System.out.println("You have bought " +quantity + " " + item +"'s");
        System.out.println("your total is: $" +total); 
        scanner.close();


    }
}
