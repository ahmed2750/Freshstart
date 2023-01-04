package encapsulation;

import java.util.Scanner;

public class IfelseCondition {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System .in);
		System.out.println("Enter the grade");
		int n = scan.nextInt();
		//System.out.println();
	if(n>=90 && n<= 100) {
		System.out.println("A");
	}
	else if (n >=80 &&  n<=89) {
		System.out.println("B");
		
	}else if(n>=60 && n<70) {
		System.out.println("f");
	}
	else {
		System.out.println("number is not in range");
		
	     }
	  }	
	}


