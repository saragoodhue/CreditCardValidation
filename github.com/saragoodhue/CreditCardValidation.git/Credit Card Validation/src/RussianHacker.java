import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RussianHacker
	{
		static int numberOfCards;

		public static void main(String[] args) throws IOException
			{
				randomNumberGenerator();
				fillArray();
			}
		public static void randomNumberGenerator() throws IOException
		{
			int[] cardLength = new int[16];
			int numberOfCards = 0;
			
			while(numberOfCards <= 1600)
				{
					for(int i = 0; i < 15; i ++)
						{
							int numberRandom = (int) (Math.random()*10);
							cardLength[i] = numberRandom;
							numberOfCards ++;	
							System.out.print(cardLength[i]);
							
							fillArray();
						}
					System.out.println();
				}
			
		}
		
		public static void fillArray() throws IOException 
		{
			//Scanner numbers = new Scanner(new File( "realNumbers.txt" ));
			int counter = 0; // counting valid card numbers
			
			while(numberOfCards > 0)
				{
					int[] nums = new int[16];
					//int numberOfCards = 0;
					
					//while(numberOfCards <= 100)
						//{
							//for(int i = 0; i < 15; i ++)
								//{
									//int numberRandom = (int) (Math.random()*10);
									//nums[i] = numberRandom;
									//numberOfCards ++;	
									//System.out.print(nums[i]);
								//}
							//System.out.println();
									
					
					for (int i = 0; i < 15; i++)
						{
							nums[i] = (int) (Math.random() * 10);
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
							for(int c = 0; c < 16; c++) {
								System.out.print(nums[c]);
							}
							System.out.print(" is a valid number");
							System.out.println();
						}
					else
						{
							for(int c = 0; c < 16; c++) {
								System.out.print(nums[c]);
							}
							System.out.print(" is a valid number");
							System.out.println();
						}	
				}
			//System.out.println("There are " + counter + " valid credit card numbers");
		}

	}
