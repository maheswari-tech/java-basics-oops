abstract class Animals{
    public void eyes()
    
    {
        System.out.println(" It has two eyes");
    }
    public void tail(){
        System.out.println("It has a tail");
    }
    abstract void fur();
}
class Carnivores extends Animals{
    public void fur(){
        System.out.println("It has fur");
    }
    public void type(){
        System.out.println("This ests only meat");
    }
}
class Omnivores extends Animals{
    public void fur(){
        System.out.println("It has no fur");
    }
    public void type()
    {
        System.out.println("This eats both plants and meat");
    }
}
public class AbstractDemo2{
    public static void main(String[] args) {
    Carnivores x = new Carnivores();
    Omnivores y = new Omnivores();
    System.out.println("This is Carnivore");
    x.eyes();
    x.tail();
    x.fur();
    x.type();
    System.out.println("This is Omnivores");
    y.eyes();
    y.tail();
    y.fur();
    y.type();
}
}
