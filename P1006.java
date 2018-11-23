import java.util.Scanner;

public class P1006 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float A,B,C,MEDIA;
		A=input.nextFloat();
		B=input.nextFloat();
		C=input.nextFloat();
		MEDIA=((A*2)+(B*3)+(C*5))/10;
		System.out.printf("MEDIA = %.1f\n",MEDIA);
		input.close();

	}

}
