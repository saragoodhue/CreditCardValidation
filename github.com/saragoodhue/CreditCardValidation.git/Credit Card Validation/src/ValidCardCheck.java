import java.util.Scanner;
import java.io.File;
import java.io.IOException;
    
public class ValidCardCheck
	{
		
		static int numbers;

		public static void main(String[] args) throws IOException
			{
			
				//test
				int counter = 0;
				
				while(numbers.hasNext())
					{
						for(int i = 0; i < 99; i ++)
							{
								
							}
					}
			}
		
		public static void digitStrip() throws IOException
		{
			Scanner numbers = new Scanner(new File( "creditcardnumbers.txt" ));
			int cardNumber = numbers.nextInt();

			while (cardNumber > 0)
				{
					int digitCheck = cardNumber % 10;
				}
		}

	}
