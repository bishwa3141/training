

package training;
import java.util.Random;


public class tutorial {
	
	public static void main(String Args[]){
	
	int dicearray[] = new int[7];
	
	
	Random rand = new Random();
	
	for(int roll = 1; roll < 1000; roll++)
	{
		++dicearray[1 + rand.nextInt(6)];
	}
		
	for(int i = 0; i < dicearray.length; i++)
	{
		System.out.println(i + "\t" + dicearray[i]);
	
	}
}
}
