
public class Dice{

	
	
	private int number;
	private int valueNumber;


	

	public Dice(int num)
	{
		number =num;
		}

		
		public int OneDice()
		{
			
			int random = (int) (1+Math.random() * 6);
			return random;	
		}
		
		public int TwoDice(){
			
			int random = (int) (Math.random() * 12+2);
			valueNumber = random;
			return random;
		}
			
			
		
		public int ThreeDice(){
			int random = (int) ((Math.random()* 18)+2);
			valueNumber = random;
			return random;
			
		}
		
	//lab week11	
		
			public Dice(){
			
		}
			
		public int Throw(){
			int random = (int) (1+ Math.random()*6);
			valueNumber = random;
			return random;
		}
		
	
		
		public int Value(){
			return valueNumber;
		}
		
		public int Throw(int bounce){
			int i=0;
			while(i<bounce)
					{Throw();
					i++;}
			
			return valueNumber;
			
			
		}
}
		
	

