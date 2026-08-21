// define an interface for animal

interface Animal
{
    void makesound();
    void eat();
    
}
class Dog implements Animal
{
    public void makesound()
    {
        System.out.println("woof!..");
    }
    public void eat()
    {
        System.out.println("Dog is eating Dog food.");
    }
}
class Cat implements Animal
{
    public void makesound()
    {
        System.out.println("Meow!..");
    }
    public void eat()
    {
        System.out.println("Car is eating cat food.");
    }
}

public class interfaces
{
    public static void main(String[]args)
    {
        Animal dog=new Dog();
        Animal cat=new Cat();
      
      System.out.println("Dog:");
      dog.makesound();
      dog.eat();

      System.out.println("Cat:");
      cat.makesound();
      cat.eat();

    }
}


