
package kyleeprescottch4;
import java.util.Scanner;

public class AdditionGame {
	/*
	 * 10/18
	 * kylee prescott
	 */
	


	public static void main(String[] args) {
		int x=1;	
		while(x==1) {
		Scanner input = new Scanner(System.in); {
			int num1 =(int)(System.currentTimeMillis() % 100 );
			int num2 = (int)(System.currentTimeMillis()/7 %100 );
			int answer;
			int total;
			
			System.out.println(" What is "+num1+ " + " +num2+"?");
			answer = input.nextInt();
	        total = num1+num2;
	        if(answer == total) {
	        	System.out.println("thats correct!!!");
	        
	        }
	        else {
	        	System.out.println("thats wrong!!");
	        	System.out.println(" the correct answer is:"+total);
	        	x=0;
	        }
	        System.out.println("The game is over ");
		}
		}
}}

