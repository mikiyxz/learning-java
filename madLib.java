import java.util.Scanner;

public class madLib {
    public static void main(String[] args) {
        //mad lib game
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String name1;
        String place1;
        String noun1;
        String adjective2;
        String noun2;

        System.out.println("Enter an adjective:");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a name: ");
        name1 = scanner.nextLine();
        System.out.println("Enter a place: ");
        place1 = scanner.nextLine();
        System.out.println("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.println("Enter another adjective; ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter another noun: ");
        noun2 = scanner.nextLine();

        System.out.println("Once upon a time, a "+ adjective1 + " hero named "+ name1 +" went on a journey to the "+ place1 +". They carried a "+ noun1 +" and fought a "+ adjective2 +" dragon. In the end, they found a "+ noun2 +" and lived happily ever after.");
        scanner.close();
    }
    
}
