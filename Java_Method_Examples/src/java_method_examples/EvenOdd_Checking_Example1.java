package java_method_examples;

import java.util.Scanner;

public class EvenOdd_Checking_Example1 {
	
	//User defined method
	public static void findEvenOdd(int num) {
		//method body
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
	}
	public static void main(String[] args) {
		
		//Accepting input from the user
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to check even or odd");
		int num=sc.nextInt();
		
		//Method calling
		findEvenOdd(num);
	}
}
