class First// this is a normal class that uses a method with return type int//
{
    int add(int a , int b)
    {
        int c = a+b;
        return c;
    }
}
class object
{
    void getadd(First g)// the parameter is set as the type  object of the first class//
    {
        System.out.println(g.add(5,75));
    }
}
public class objpara
{
    public static void main(String args[])
    {
        object x = new object();// creating object for the object class//
        First y = new First();//creating object for the first class//
        x.getadd(y);//x object is the link bw this and the above class with argument y(object of first class) this calls the object method and to first method//
    }
}
