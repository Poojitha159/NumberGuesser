package com.techlabs.numguess;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String PlayAgain;
        do {
        	random.setSeed(System.currentTimeMillis());
            int numberGuess = random.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            boolean guessedCorectly=false;
            while(attempts<5)
            {
            	System.out.println("Random number generated:"+numberGuess);
            	System.out.println("Guess a number:");
            	guess=scanner.nextInt();
            	attempts++;
            	if(guess<numberGuess)
            	{
            		System.out.println(" Sorry Too Low");
            	}
            	else if(guess>numberGuess) {
            		System.out.println(" Sorry . Too High");
            		
            	}
            	else {
            		boolean guessedCorrectly=true;
            		break;
            		
            	}
            	
            }
            if(guessedCorectly)
            {
            	System.out.println(" You won: In attempts :"+attempts);
            }
            else {
            	System.out.println(" You winning. the number was"+numberGuess);
            }
            System.out.println(" Do you want to play again : yes/no");
            scanner.nextLine();
            PlayAgain=scanner.nextLine();
            
        }while(PlayAgain.equals("yes"));
        
        System.out.println("Thanks for play");

	}

}
