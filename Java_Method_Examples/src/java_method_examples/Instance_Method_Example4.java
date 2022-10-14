package java_method_examples;

public class Instance_Method_Example4 {
	
	//instance method
	int s;
	//user defined method
	public int add(int a, int b) {
		s=a+b;
		return s;
	}
	public static void main(String[] args) {
		//creating an object for the class
		Instance_Method_Example4 obj=new Instance_Method_Example4();
		
		//invoking instance method
		System.out.println("The sum is: "+obj.add(12,13));

	}

}
