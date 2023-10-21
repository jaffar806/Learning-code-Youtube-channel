package learncodingyouyubechannel;

import java.util.Scanner;

public class RelationalOperator 
{
	public RelationalOperator(int firstN, int secondN) //created constructed relational operator(int, int )
	{
		System.out.println(firstN+"<"+secondN+ " = "+(firstN<secondN));
		System.out.println(firstN+">"+secondN+ " = "+(firstN>secondN));
		System.out.println(firstN+"<="+secondN+ " = "+(firstN<=secondN));
		System.out.println(firstN+">="+secondN+ " = "+(firstN>=secondN));
		System.out.println(firstN+"=="+secondN+ " = "+(firstN==secondN));
		System.out.println(firstN+"!="+secondN+ " = "+(firstN!=secondN));
	}

	public static void main(String[] args)
	{
		int firstN, secondN;
		Scanner s = new Scanner(System.in);
		System.out.println("entered two numbers ");
		firstN = s.nextInt();
		secondN = s.nextInt();
		
		
		
		RelationalOperator op = new RelationalOperator(firstN,secondN); 	
	}

}
