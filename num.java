import java.util.Scanner;
public class num {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a number from 1 to 7:");
        int Num = scanner.nextInt();
        if (Num == 1) {
            System.out.println("Monday");
        } else if (Num == 2) {
            System.out.println("Tuesday");
        } else if (Num == 3) {
            System.out.println("Wednesday");
        } else if (Num == 4) {
            System.out.println("Thursday");
        } else if (Num == 5) {
            System.out.println("Friday");
        } else if (Num == 6) {
            System.out.println("Saturday");
        } else if (Num == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Number");
        }

        
    }
    
}
