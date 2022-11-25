import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Guesser
{
	int guesserData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hi Guesser! Please Guess A Number");
		int num=sc.nextInt();
		return num;
	}
}
class Players
{
    int[] playerData()
    {
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter How Many Players");
	    int total=sc.nextInt();
        int[] totalPlayers=new int[total];
        for(int i=0;i<total;i++)
        {
            System.out.println("Player"+(i+1)+" Enter Your Choice Of Number");
            totalPlayers[i]=sc.nextInt();
        }
        return totalPlayers;

    }
    
}
class winnerDeclaration
{
    void referee(int[] plData, int gN)
    {
        int count=0;
        for(int i=0;i<plData.length;i++)
        {
            if(plData[i]==gN)
            {
                count=count+1;
                System.out.println("Wow! Player"+(i+1)+" Guessed It Correctly");
            }
        }
        if(count==0)
        System.out.println("Sorry, None Of You Guessed It, Better Luck Next Time");
        else 
            return;
    }
}
class numGuesserGame
{
public static void main(String[] args)
{
    int guessNum;
	int[] playerNum;
	Guesser g=new Guesser();
	guessNum=g.guesserData();
    winnerDeclaration wd=new winnerDeclaration();	
    Players pl=new Players();
    playerNum=pl.playerData();
    wd.referee(playerNum,guessNum);
}
}