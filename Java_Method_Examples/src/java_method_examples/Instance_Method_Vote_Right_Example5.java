package java_method_examples;

import java.util.Scanner;

public class Instance_Method_Vote_Right_Example5 {
	//instance method
	public int voteRight(int age) {
		if(age>18) {
			System.out.println("eligible for vote");
		}
		else {
			System.out.println("Not eligible for vote");
		}
		return age;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:-");
		int age=sc.nextInt();
		
		//Creating object for class
		Instance_Method_Vote_Right_Example5 obj=new Instance_Method_Vote_Right_Example5();
		//invoking the instance method
		System.out.println(obj.voteRight(30));
	}
		
}
