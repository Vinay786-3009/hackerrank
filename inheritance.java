class Animal
{
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal{
    void fly()
    {
        System.out.println("I am flying");
        System.out.println("I am singing");
    }
}
 public class inheritance{
        public static void main(String ags[])
    {
        Bird s=new Bird();
        s.walk();
        s.fly();
    }
    
 }