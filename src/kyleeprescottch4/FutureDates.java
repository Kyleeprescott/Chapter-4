package kyleeprescottch4;
import java.util.Scanner;
public class FutureDates {
	/*
	 * kylee prescott
	 * 10/18
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// declare variables
		int Sunday = 0;
		int Monday =1;
		int Tuesday = 2;
		int Wedneday = 3;
		int Thursday = 4;
		int Friday = 5;
		int Saturday = 6;
		
		//user input 
		System.out.println("Enter the integer for todays date.(Sunday is 0)");
		int DayOfTheWeek = input.nextInt();
		System.out.println("Enter the number of days elasped since today.");
		int ElapsedDays = input.nextInt();
		
		//calculations
		switch ((DayOfTheWeek + ElapsedDays)%7) {
		
		//display output
		
		case 0:
			System.out.println("The day of the week is Sunday ");
			break;
		case 1:
			System.out.println("The day of the week is Monday");
			break;
		case 2:
			System.out.println("The day of the week is Tuesday");
			break;
		case 3:
			System.out.println("The day of the week is Wednesday");
			break;
		case 4:
			System.out.println("The day of the week is Thursday");
			break;
		case 5:
			System.out.println("The day of the week is Friday");
			break;
		case 6:
			System.out.println("The day of the week id Saturday");
			
		
	
		
			
			
		
		}
		
	
		
			
		
		
		
		
		

	}

}
