import java.util.Scanner;

public class SimpleInterest{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter P");
	double P = scanner.nextDouble();
	System.out.println("Enter R");
	double R = scanner.nextDouble();
	System.out.println("Enter T");
	double T = scanner.nextDouble();
	double SI = (P*T*R)/100;
	System.out.println("si="+SI);

}
}