public class StaticBlockDemo
{
    static{
        int a =54 ;
        int b = 35;
        int c;
       c = a+b;
       System.out.println("This is add result:"+c);
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
    }
}
