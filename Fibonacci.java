import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        int x = 0, y = 1;
        System.out.println("Fibonacci Sequence: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(x + " ");
            int z = x + y;
            x = y;
            y = z;
        }
    }
}
