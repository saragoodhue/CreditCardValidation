import java.util.Scanner;
import java.io.File;
import java.io.IOException;
    
public class ValidCardCheck
	{
		
		static int counter;
		
		public static void main(String[] args) throws IOException
			{
			
				
				fillArray();
				

			}
		
		public static void fillArray() throws IOException 
		{
			Scanner numbers = new Scanner(new File( "creditcardnumbers.txt" ));
			
			while(numbers.hasNext())
				{
					String cardNumber = numbers.nextLine();
					System.out.println(cardNumber);
					
					while (cardNumber.length() > 0)
						{
							int n = 0;
							
							if(n % 2 == 0)
								{
									 int newValue = Integer.parseInt(cardNumber.substring(n, n + 1)) * 2;
								}
							
							int numberPlace = Integer.parseInt(cardNumber.substring(n, n + 1));
							int digitCheck = numberPlace % 10;
							n += 1;
							
							
						}
				}
		}
		
		public static void digitStrip() throws IOException
		{

		}

	}
