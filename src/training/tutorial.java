
package training;
import java.util.Scanner;

public class tutorial {
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int firstnum, secondnum, thirdnum; 
		
		System.out.println("Enter the first number: ");
		firstnum = input.nextInt();
		
		System.out.println("Enter the second number");
		secondnum = input.nextInt();
		
		System.out.println("Enter the third number");
		thirdnum = input.nextInt();
		

		if(firstnum > secondnum && firstnum > thirdnum)
		{
			System.out.println("First number is the biggest");
		}
		else if (secondnum > thirdnum)
		{
			System.out.println("Second number is the biggest");
			
		}
		
		else {
			System.out.println("Third number is the largest");
		}
		
	}
}
