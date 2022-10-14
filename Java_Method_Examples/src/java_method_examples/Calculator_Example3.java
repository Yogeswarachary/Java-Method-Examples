package java_method_examples;

import java.util.Scanner;

public class Calculator_Example3 {
	public static void calculator(int num1, int num2) {
		//method body
		int result;
		System.out.println("------Welcome to calculator program------");
		System.out.println("For doing operations, you have to select the choices");
		System.out.println("Choose 1 for Addition");
		System.out.println("Choose 2 for Substraction");
		System.out.println("Choose 3 for Multiplication");
		System.out.println("Choose 4 for Division");
		System.out.println("Choose 5 for Modulus");
		
		//requesting user to enter choice value
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your choice value");
		int ch=sc.nextInt();
		
		//using switch case we can create calculator code
		switch(ch) {
		case 1:
			result=num1+num2;
			System.out.println("The addition of two numbers is "+result);
			break;
		case 2:
			result=num1-num2;
			System.out.println("The subtraction of two numbers is "+result);
			break;
		case 3:
			result=num1*num2;
			System.out.println("The multiplication of two numbers is "+result);
			break;
		case 4:
			result=num1/num2;
			System.out.println("The division of two numbers is "+result);
			break;
		case 5:
			result=num1%num2;
			System.out.println("The modulus  of two numbers is "+result);
			break;
		default:
			System.out.println("Wrong choice, Please choose choice(1,2,3,4,5 only)");
		}
	}
	//main method
	public static void main(String[] args) {
		//requesting input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the first number:-");
		int num1=sc.nextInt();
		System.out.println("Please enter the second number:-");
		int num2=sc.nextInt();
		
		//method calling
		calculator(num1, num2);
	}
}
