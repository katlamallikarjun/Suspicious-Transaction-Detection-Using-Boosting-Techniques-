import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Suspicious Transaction Detection System ===");

        System.out.print("Enter Transaction Amount: ");
        double amount = sc.nextDouble();

        if(amount > 50000) {
            System.out.println("⚠ Suspicious Transaction Detected!");
        } else {
            System.out.println("✅ Normal Transaction");
        }

        sc.close();
    }
}
