import java.util.Scanner;


public class RealLab1 {

	
	
	
	
	public static void main(String[] args){
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Press 1 to throw a a Dice");
		
		int choice = input.nextInt();
		System.out.println("Ok, guess the number 1-6");
		int guess = input.nextInt();
		
		Dice DiceGame = new Dice();
		
		int random=DiceGame.Throw();
		if(guess==random){
		System.out.println("Correct");}
		
		else {
			System.out.println("Sorry");}
		
		System.out.printf("The random number is %d", DiceGame.Value());
		
		
		
	}
}
