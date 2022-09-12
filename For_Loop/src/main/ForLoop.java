package main;
public class ForLoop{  						  // Main class
	 public static void main(String[] args) { // Class main method.
		for(int i = 0; i< 10; i++) { 		  // declare and assign 0 to a int variable, it's condition is run until variable come to 10,
											  // increase every time +1.
			if(i % 2==0) {					 
				System.out.println("The Even Number is: " + i); // if the condition is true then it will execute.
			}
			else {
				System.out.println("The Odd Number is : "+i); // Or the condition false it will execute.
			}
		}
	}
}