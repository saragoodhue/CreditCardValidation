import java.util.Scanner;
import java.io.File;
import java.io.IOException;
    
public class ValidCardCheck
	{
		
		static int counter;
		static int sum = 0;
		static int n = 0;
		
		public static void main(String[] args) throws IOException
			{
			
				
				fillArray();
				//System.out.println(counter);

			}
		
		public static void fillArray() throws IOException 
		{
			Scanner numbers = new Scanner(new File( "creditcardnumbers.txt" ));
			int counter = 0; // counting valid card numbers
			
			while(numbers.hasNext())
				{
					String cardNumber = numbers.nextLine();
					System.out.println(cardNumber);
					sum = 0;
					
					
					
					while (cardNumber.length() > 0 && cardNumber.length() < 17)
						{
							for (int i = 0; i < cardNumber.length(); i++)
								{
									int numberPlace = Integer.parseInt(cardNumber.substring(i, i + 1));
								}
							 // digit stripping
							int digitCheck = numberPlace % 10;		
							
							
							if(n % 2 == 0) // doubling numbers in even places and checking for double digits
								{
									 int number = (Integer.parseInt(cardNumber.substring(n, n + 1))); // multiplying the first digit and every other one after by 2
									 int doubleNumber = number * 2;
									 if(doubleNumber > 10)
										 {
											 doubleNumber = Integer.parseInt(cardNumber.substring(0, 1)) + Integer.parseInt(cardNumber.substring(1, 2));
										 }
					
									 sum += doubleNumber;
									 n += 1;
									 
								}
							else // adding the numbers in odd places to the sums
								{
									
									sum += numberPlace;
									n += 1;
									
								}
							
							//n += 1; // moving this a number place 
							
							
							if(sum % 10 == 0) // checking if the card is valid
								{
									counter ++;
								}
							
							
						}
					
			
					
				}
		}
		

	}
