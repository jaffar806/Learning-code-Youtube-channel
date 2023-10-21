package learncodingyouyubechannel;

import java.util.Scanner;

public class LogicalOperator

{
	public LogicalOperator (int firstO, int secondO) 
	{ 
		 System.out.println(firstO+ " || " +secondO+ " = " +(( firstO > secondO)||(firstO < secondO))); //if 5>2 || 5<2 = if any one of the condition is true answer is True
		 System.out.println(firstO+ " && " +secondO+ " = " +((firstO > secondO)&&(firstO < secondO))); //if 5>2 && 5<2 = both condition should be true  then answer is True
		 System.out.println(firstO+ " ! " +secondO+ " = " +((firstO > secondO)!=(firstO < secondO)));  // if the condition of != occur then it says True
	
	}

	public static void main(String[] args)
	{
		int firstO, secondO;																																				
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter the operands"); 
		firstO = s.nextInt();
	    secondO = s.nextInt();
	    
	    
	    //calling a constructer
	    LogicalOperator f =  new LogicalOperator(firstO, secondO);
	}	

}
