class animal{
	String name ="animal";
	void eat(){
		System.out.println("This animal eats food");
	}
}

class Dog extends animal{
	void bark(){
		System.out.println("The dog barks: woof! woof!");
	}
}

class puppy extends Dog{
    void weep(){
        System.out.println("puppy is weeping");
    }
}

public class testMultilevel{
	public static void main(String[]args){
	puppy p =new puppy();
	p.eat();
	p.bark();
    p.weep();
 }
}
	
		