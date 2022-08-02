import java.util.Scanner;
import java.util.ArrayList;

class Assignment2 {
	public static void main(String arg[]) {
		question7();
	}
	static void question1() {
		Scanner obj = new Scanner(System.in); 
		System.out.println("enter number");
		int number = obj.nextInt();
		if (number%2==0) {
			System.out.print("number is even");
		} else {
			System.out.print("number is odd");
		}
	}
	static void question2() {
		Scanner obj = new Scanner(System.in); 
		System.out.println("enter number");
		int number = obj.nextInt();
		if (number>55) {
			System.out.println("number is greater than 55");
		} else {
			System.out.println("number is either less than or equal to 55");
		}
	}
	static void question3() {
		Scanner obj = new Scanner(System.in); 
		System.out.println("enter number 1");
		int number1 = obj.nextInt();
		System.out.println("enter number 1");
		int number2 = obj.nextInt();
		if (number1==number2) {
			System.out.println("numbers are equal");
		} else if (number1>number2) {
			System.out.println("number 1 is greater");
		} else if (number2>number1) {
			System.out.println("number2 is greater");
		}
	}
	static void question4() {
		
		Scanner obj = new Scanner(System.in); 
		System.out.println("enter roll number");
		int rollNumber = obj.nextInt();
		switch(rollNumber) {
			case(579) : 
				System.out.println("579 is Sonu's roll number");
				break;
			case(546) : 
				System.out.println("546 is Monu's roll number");
				break;
			case(553) : 
				System.out.println("553 is Manu's roll number");
				break;
			case(544) : 
				System.out.println("544 is Meenu's roll number");
				break;
			case(516) : 
				System.out.println("516 is Meena's roll number");
				break;
				default  : 
				System.out.println("Message not allowed");
					
				
		}
	}
	/* QUESTION 5
	
	Pass By Value : Pass by value refers to passing the value of variable to another in such a way, that only the copy 
	 of original variable is shared with other variable.
	 This means that changing the value of other variable will not affect the original value of the
	 original variable.
	 Java works with pass by value only
	
		 Example is written in the form of code, below.
		 class PassByValue {
			 public static void main(Strings arg[]) {
				 int a=10; // let a be avariable with value 10
				 System.out.println(" value of a "+ a); // this prints 10
				 increment(a); // passing the value of a to the parameter  
				 System.out.println(" value of after apply the function"+ a); // this prints 10
			 }
			 static void increment(int a) { //here a is the parameter of the function
				 a++;
				 System.out.println(" value inside the function"+ a) //this will priint 11
			 }
		 }
	Pass by Reference : Pass by reference means, when we wish to pass the value of one thing to
		to another thing in such a way that only the reference of the memory in which that thing is place
		will be given.
		 
		 
	*/ 
	
	
	static void question6() {
		Scanner obj = new Scanner(System.in); 
		System.out.println("enter number of times loop should run. number should be greater than zerro.");
		int number = obj.nextInt();
		for (int i=1; i<=number; i++) {
			System.out.println(i);
		}
	}
	static void question7() {
		int arr[] = new int[10];
		int i;
		Scanner obj = new Scanner(System.in); 
		System.out.println("enter array numbers one by one");
		for (i=0; i<10; i++) {
			int arrayNums = obj.nextInt();
			arr[i]=arrayNums;
		}
		
		
		System.out.println("the array is");
		for (i=0; i<10; i++) {
			System.out.println(arr[i]);
		}
		
	
		
	}
	static void question8() {
		int counter=1;
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if (counter%2==0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
				counter++;
			}
			System.out.println(" ");
		}
	}
}