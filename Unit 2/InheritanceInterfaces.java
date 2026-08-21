interface Dog{
    void eat();
}
interface cat extends Dog{
    void sleep();
}
class puppy implements cat{
    public void eat()
    {
        System.out.println("cat eat food.");
    }
    public void sleep()
    {
        System.out.println("Zzzzz..");
    }
}
 public class InheritanceInterfaces
 {
    public static void main(String[]args)
    {
        puppy p=new puppy();
        p.eat();
        p.sleep();
    }
 }