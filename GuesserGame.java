import java.util.*;

class  Guesser
{
	int guessNum;
	
	int guessingNumber()
	{
		System.out.println("Enter the number of guess...!");
		Scanner sc = new Scanner(System.in);
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Player
{
	
	int guessNum;
	int guessingNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Player guess the number...");
		guessNum = sc.nextInt();
		return guessNum;
	}
	
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromplayer3;

	void collectNumFromGuesser()
	{
	    
		Guesser g = new Guesser();
		numFromGuesser=g.guessingNumber();
	}
	void collectNumFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		 numFromPlayer1=p1.guessingNumber();
		 numFromPlayer2=p2.guessingNumber();
		 numFromplayer3=p3.guessingNumber();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			System.out.println("Player1 won the game");
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			System.out.println("Player2 won the game");
		}
		else if(numFromGuesser==numFromplayer3)
		{	
			System.out.println("Player3 won the game");
		}
		else
		{
			System.out.println("You lose game!!!!!!!!!");
		}			
    }
}

public class GuesserGame
{
	public static void main(String[] args)
	{
		System.out.println("Game Started..");
		Umpire u =new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();
	}
}






