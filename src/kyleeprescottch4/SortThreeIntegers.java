package kyleeprescottch4;
import java.util.Scanner;
public class SortThreeIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//user input 
		System.out.println("Enter three integers");
		
		//declare variables 
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		System.out.println("The non-decreasing order of your integers is:");
		
         // calculations
		if (num1>num2) {
			System.out.println(+num2);
		}
		
		else if (num3>num2) {
			System.out.println(+num3);
		}
	}
	

}
