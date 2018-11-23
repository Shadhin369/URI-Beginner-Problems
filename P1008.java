import java.util.Scanner;

public class P1008 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number,hours ;
		float payment;
		
		number=input.nextInt();
		hours=input.nextInt();
		payment=input.nextFloat();
		
		float salary = hours*payment;
		
		System.out.printf("NUMBER = "+number+"\nSALARY = U$ %.2f\n",salary);
		input.close();
	}

}
