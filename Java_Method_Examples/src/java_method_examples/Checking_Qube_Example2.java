package java_method_examples;

import java.util.Scanner;

public class Checking_Qube_Example2 {
	
	//creating user defined method
	public static void qube(int num) {
		int result=num*num*num;
		System.out.println(num+" qube is "+result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check qube");
		int num=sc.nextInt();
		
		//method calling
		qube(num);
	}
}
