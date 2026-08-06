class animal{
	String name ="Animal";
//write a java program to perform simple inheritance
	
	void eat(){
		System.out.println("This animal eats food");
	}
}

class Dog extends animal{
	void bark(){
		System.out.println("The dog barks: woof! woof!");
	}
}

public class main{
	public static void main(String[]args){
	Dog myDog =new Dog();
	myDog.eat();
	myDog.bark();
 }
}
	
		