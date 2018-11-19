package kyleeprescottch4;
import java.util.Scanner;

public class LotteryGame {
/*
 * kylee prescott
 * 10/18
 */
	public static void main(String[] args) {
	//genertate number 
	String lottery = ""+(int)(Math.random()*10)+(int)(Math.random()*10); 
	
	// prompt the user
	Scanner input = new Scanner(System.in);
     System.out.println("Eneter your lottery pick(two digits): ");
   String guess = input.nextLine();

   
   
   // get lottery number
   char lotteryDigit1 = lottery.charAt(0);
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
