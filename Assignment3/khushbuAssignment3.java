/* Question 1 
	Encapsulation: 
	--> Encapsulation is a part of OOP.
	--> It means combining or wrapping the data members in a single class or block.
	--> It prevents the data from unintented access or manipulation.
	-->	It works on data hiding concept which is achieved by using private access modifier before any data member of a class.
	--> To access the private data member of a class, we can create public methods (like getters and setters) , but these methods 
		does not give direct access to private data members.
	Example : Example is written below in the form of program

import java.util.Scanner;

class Question1 { 
	public static void main(String args[]) {
		EncapClass obj = new EncapClass(); 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println(" enter name");
		
		String name = sc.nextLine(); 
		
		obj.setAge(name , 20); //set the name as input taken
		
		System.out.println(+ obj.getAge(name)); 
		
	}
}
class EncapClass {
	private final String name = "Khushbu"; 
	private int age = 0;  //
	
	void setAge(String name, int age) { //this function will help us set the new inputs of name and age.
		if (checkName(name)) { 
			this.age = age;
		}
	}
	int getAge(String name) {
		if (checkName(name)) {
			System.out.println("Name entered is incorrect");
			return age;
		} else {
			System.out.println("Name entered is incorrect");
			return 0;
		}
		
	}
	
	boolean checkName(String name) {
		return this.name.equals(name);
		
	}
	
}
*/

/* Question 2 
	Polymorphism: 
	--> Polymorphism word is made up of 2 words, poly + morph where poly means many and morph means forms.
	--> It is one of the most important part of OOP.
	--> It is the ability of an entity to be used in many forms or to take many forms.
	--> It can be achieved with the help of "method overloading" and "method overriding" which are the two types of polymorphism.
	--> Method Overloading is creating the method of same name in a same class with different parameters or return types.
	--> Method Overridding is creating the method of same name in a different classes (in parent and child class) 
		with the help of Inheritance. In method overriding , methods can have should have same arrguments or return type.
	-->	To access the method from Base class we can use the keyword "super".
	
	Example : Example is written below in the form of program



class Question2 extends Base { 
	public static void main(String args[]) {
		Question2 obj = new Question2();
		obj.method1(); 
		obj.method2(); 
		obj.method2(0);
	}
	void method1() {  //this method1 will override method1 in base class
		System.out.println("This is method 1 in  class 'Question 2' which extends Base class.");
	}
	
	//method overloading
	void method2() {  
		super.method1();
	}
	void method2(int a) {
		System.out.println("This is method2 in class 'Question 2' and a = " + a);
	}

}

class Base {
	
	void method1() {
		System.out.println("This is method 1 in base class");
	}
}
*/

/* Question 3
	Access Modifiers:
	--> Access modifiers are the element of java which allow certain data memebers the be accessed by other classes or packages
	--> There are Four Types if Acess Modifiers in java, those are:
		--> public : any data memeber with the public Access modifier is accessible to any class or package.
		--> default : any data memeber with the default Access modifier is accessible to same class or same package or same subclass and subclasses in diff package
		--> protected: any data memeber with the protected Access modifier is only accessible to same class or pakage or same subclass
		--> private: any data memeber with the private Access modifier is only accessible to same class.
	Packages: 
	-->Packages are the group of classes encapsulated together in a file.
	-->Packages has classes of similar type.
	Final  Keyword:
	--> when a Final keyword  is used infront of any data member, the value of that data member becomes fixed.
	--> the value of final data member cannor be changed
*/

/* Question 4

class Rectangle {
	int breadth = 10;
	static int length = 5;
	static void area() {
		System.out.println("this is the method area in Rectangle class");
	}

	void circumference () {
		System.out.println("this is the method circumference in Rectangle class");
		
	}
}
class Shape extends Rectangle {
	public static void main(String args[]) {
		Rectangle.area();
		Rectangle obj = new Rectangle();
		obj.circumference();
		System.out.println(Rectangle.length);
		System.out.println(obj.breadth);
		
	}
	
}
*/

/* Question 5
class Main {
	public static void main(String arg[]) {
		pattern();
	}
	static void pattern() {
		for (int i=1; i<=5; i++) {
			for(int j=i; j<5; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<i; j++) {
				System.out.print("1" + " ");
			}
			System.out.println();
			
		}
	}
}
*/

