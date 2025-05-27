abstract class cbook{
    void book()
    {
        System.out.println("Heloo, I am abstract class");
    }
    abstract void pages();
}
class jbook extends cbook{
    public void pages(){
        System.out.println("Right here is concrete of pages");
    } 
}
class AbstractDemo{
    public static void main(String[] args) {
    jbook x = new jbook();
    x.book();
    x.pages();
}
}   
