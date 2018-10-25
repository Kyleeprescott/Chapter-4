package kyleeprescottch4;
import java.util.Scanner;

public class HeadsOrTails {

	public static void main(String[] args) {
		// import the scanner 
		Scanner input = new Scanner(System.in);

		//user input
	
	 int flip;
	   // declare varibles 
	int num1 =(int)(System.currentTimeMillis() % 10 );
	num1 = (int)(System.currentTimeMillis() %2 );
	 int heads = 0;
	 int tails = 1;
	 if (num1 == 0) {
		 flip = 0;
	 }
	 else {
		 flip = 1;
	 } 
	 System.out.println("guess 0 for heads 1 for tails");
	 
	 int guess = input.nextInt();
	 if (guess == flip ) {
		 System.out.println(" correct");
		 
		 
	 }
	 else {
		 System.out.println("incorrect");
		 
	 }
	
		

	}

}
