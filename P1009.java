import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		String name;
		double fixedSalary,sale,totalSalary;
		
		name=input.nextLine();
		fixedSalary=input.nextDouble();
		sale=input.nextDouble();
		
		totalSalary=((15*sale)/100)+fixedSalary;
		System.out.printf("TOTAL = R$ %.2f\n",totalSalary);
		input.close();
    }
 
}
