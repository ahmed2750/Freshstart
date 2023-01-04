package restart;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int number,i;
		
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number ");
      number = scan . nextInt();
      for (i=1; i<= 20; i++) {
      System.out.println(number+"*"+i+"="+(number*i));
      }  

	}
}
