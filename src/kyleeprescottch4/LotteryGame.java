package kyleeprescottch4;
import java.util.Scanner;

public class LotteryGame {
/*
 * kylee prescott
 * 10/18
 */
	public static void main(String[] args) {
	//genertate number 
	int lottery = (int)(Math.random()*100); 
	
	// prompt the user
	Scanner input = new Scanner(System.in);
     System.out.println("Enetr your lottery pick(two digits): ");
   int guess = input.nextInt();

   
   
   // get lottery number
   int lotteryDigit1 = lottery / 10;
   int lotteryDigit2 = lottery % 10 ;
   
   int guessDigit1 = guess /10;
   int guessDigit2 = guess % 10;
   
   System.out.println("The lottery number is "+lottery);
   
   if (guess ==lottery) {
	   System.out.println("Exact match: you win 10,000");
   }
   else if (guessDigit2 == lotteryDigit1 
		   && guessDigit1 == lotteryDigit2) {
   System.out.println(" Match all digits you win 3,00");
   
	}
	else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||guessDigit2 == lotteryDigit1 || guessDigit2 ==lotteryDigit2) {
		System.out.println("Match one digit:you win 1,000 ");
	}
	else {
		System.out.println("Sorry,no match");
		
		
	}
	
}

}
