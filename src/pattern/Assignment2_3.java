package pattern;

import java.util.Scanner;  //importing scanner

public class Assignment2_3 {  //class definition

	public static void main(String[] args) {  //main starts here
		
		Scanner sc=new Scanner(System.in);  //Creating scanner object
		 
		System.out.print("Enter the number of rows");  //printing this for telling user to enter value
		
		int n=sc.nextInt();    //taking user input
		
		for(int i=1;i<=n;i++)  //outer loop 
		{
			for(int j=1;j<=n;j++) //inner loop 
			{
				if((i==j) || (i+j)==(n+1)) //condition for printing pattern
					
				System.out.print("*");  //if above condition is true print this
				
				else 
					
				System.out.print(" "); //if above condition is false print this
			}
			
			System.out.println(); //shift to next line
		}
		

	}

} //class ends
