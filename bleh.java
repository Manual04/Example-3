//this programs prints out random numbers until asked to stop

import java.util.*;
public class bleh{
	public static void main(String[] args) {
		
		Random randomGenerator = new Random();
		int num = 0;
		Scanner input = new Scanner(System.in);
		String response = "";
		boolean play = true;
		
		while(play) {
			
			num = randomGenerator.nextInt(100);
			System.out.print(num);
			
			System.out.println(" Would you like to keep going?");
			response = input.next();
			
			if(response.equals("no")) {
				
				play = false;
			}
		}
		
		System.out.println("Bye!");
	}
}