package kyleeprescottch4;
import java.util.Scanner;
/*kylee prescott
 * 10/18
 */
public class Ifcalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//get 2 numbers from our user 
		System.out.println("enter the first value");
		double num1 =input.nextDouble(); 
		System.out.println(" enter the second value");
		double num2 =input.nextDouble();
		// get the operator 
		System.out.println("do you want + - * / or %");
		String opp = input.next();
		
		String plus ="+";
		
		double total = 0;
		//test input 
		if (opp.equals("+") ) {
			 total = num1 + num2;
		}
		 else if   (opp.equals("-") ){
			total = num1 - num2;
		}
		 else if (opp.equals ("*")) {
			 total = num1 * num2;
		 }
		 else if (opp.equals ("*")) {
			 total = num1 / num2;
		 }
		 else if (opp.equals("%")) {
			 total = num1 % num2;
		 }
		 else {
			 System.out.println(" that wasnt an opperator");
		 }
	
		
		
	
				
		// do calculations 
		
		//print the output 
		System.out.println("your total:"+total);
	
	
	}

}
