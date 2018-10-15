package kyleeprescottch4;

import java.util.Scanner;

/*Kylee Prescott
 *10/18
 * compute the area of a circle 
 */
public class ComputeArea {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//step one:enter the radius of a circle
		 double area =  input.nextDouble();
		 double radius;
		 
		//constant declinations 
		 final  double PI= 3.1415926535979323846264338327950288419716939;
		 
		  
		  //assign a value to the radius 
		  System.out.println("Eneter the radius of a cirlce and press enter");
		  
		  radius = input.nextDouble();
		  if (radius <0) {
			  System.out.println("you cant have a - radius");
		  }
		  else {
		  
		 
		area= radius*radius*PI;
		System.out.println("after you have entered the radius of"+radius+"we havcoputed");
 	}

}
}