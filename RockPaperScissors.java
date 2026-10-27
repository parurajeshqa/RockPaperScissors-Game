package day4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to the Rock Paper & Scissors Game");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter you choice");
		System.out.println("0: Rock, 1: Paper, 2: Scissors");
		int userChoice = scanner.nextInt();
		System.out.println(userChoice);
		
		
		if(userChoice<0 || userChoice>2)
		{
			System.out.println("Invalid Choice. Please play again and choose either 0, 1 or 2");
			return;
		}
		int computerChoice=new Random().nextInt(3);
		System.out.println(computerChoice);

		if(userChoice==computerChoice)
		{
			System.out.println("It's a tie!");
		}
		else if((userChoice==0 && computerChoice==2) || 
		       (userChoice==1 && computerChoice==0) ||
		       (userChoice==2 && computerChoice==1))
		{
			System.out.println("You win!");
		}
		else
		{
			System.out.println("Computer wins!");								
		}
		scanner.close();
	}

}
