package java_method_examples;

//abstract class
abstract class Demo{   
	//abstract method declaration  
	abstract void display();  
}  
	public class AbstractMethodExample6 extends Demo {  
		//method implementation  
		void display() {  
			System.out.println("Abstract method?");  
			}  
	public static void main(String args[]) {  
		//creating object of abstract class  
		Demo obj = new AbstractMethodExample6();  
		//invoking abstract method  
		obj.display();  
	}  
}  
