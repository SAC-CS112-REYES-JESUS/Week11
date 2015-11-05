import java.util.Scanner;


public class Lab1 {

	
	public static void main(String[] args)
	{
	Scanner input = new Scanner (System.in);

		System.out.println("Welcome to the DICE GAME!!!");
		int quit=0;
		
		while(quit ==0){
			
			
		System.out.println("Select number of  to Roll (1-3)");
		int choice = input.nextInt();
		
		Dice method = new Dice(choice);

		System.out.println("Ok, take a guess of what did you roll??");
		int guess = input.nextInt();
	
		if(choice==1){
			
			
			int oneDice =method.Throw();
			if(guess==oneDice){
				System.out.println("Congrats right number");
			}
			else
				System.out.println("Sorry");
			System.out.printf("The random dice # is: %d\n",method.Value());
			
					}
		else if(choice ==2){
			
				int twoDice =method.TwoDice();
				if(guess==twoDice){
					System.out.println("Congrats right number");
				}
				else
					System.out.println("Sorry");
				System.out.printf("The random dice # is: %d\n",method.Value());
		}

		else{ 
			int threeDice = method.ThreeDice();
					if(guess==threeDice){
						System.out.println("Congrats right number");
					}
					else
						System.out.println("Sorry");
					System.out.printf("The random dice # is: %d\n", method.Value());
			}
			
			
		System.out.println("To play press 0 or 1 to quit");
		quit=input.nextInt();
		}	
		
		System.out.println("thanks for playing");
		
		
	}


}
	
	

