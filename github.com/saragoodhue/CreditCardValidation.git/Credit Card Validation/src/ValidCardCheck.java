import java.util.Scanner;
import java.io.File;
import java.io.IOException;
    
public class ValidCardCheck
	{

		public static void main(String[] args) throws IOException
			{
				fillArray();
				System.out.println("Practice new branch");
			}
		
		public static void fillArray() throws IOException 
		{
			Scanner numbers = new Scanner(new File( "realNumbers.txt" ));
			int counter = 0; // counting valid card numbers
			
			while(numbers.hasNext())
				{
					String cardNumber = numbers.nextLine();
					int[] nums = new int[cardNumber.length()];
					
					for (int i = 0; i < cardNumber.length(); i++)
						{
							nums[i] = Integer.parseInt(cardNumber.substring(i, i + 1));
						}
					
					for (int i = nums.length - 2; i >= 0; i = i - 2)
						{
							int newNum = nums[i];
							newNum = newNum * 2;
							
							if(newNum > 9)
								{
									newNum = newNum % 10 + 1;
								}
							nums[i] = newNum;
						}
							
					int totalSum = 0;
					
					for(int i = 0; i < nums.length; i ++)
						{
							totalSum += nums[i];		
						
						}
					if(totalSum % 10 == 0)
						{
							counter++;
							System.out.println(cardNumber + " is a valid number");
						}
					else
						{
							System.out.println(cardNumber + " is not a valid number");
						}	
				}
			System.out.println("There are " + counter + " valid credit card numbers");
		}
		

	}
