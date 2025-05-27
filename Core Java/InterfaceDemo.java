interface food{
    void nonveg();//abstrac
    void veg();
}
interface food2 extends food{
    void junkfood();
    void snacks();
}
class product1 implements food2{
    public void nonveg(){
        System.out.println("This is food with type of nonveg");
    }
    public void veg(){
        System.out.println("This is the food type of veg");
    }
    public void junkfood(){
        System.out.println("This is food of type junkfood");
    }
    public void snacks(){
        System.out.println("This is the food of type snacks");
    }
}class InterfaceDemo {
    public static void main(String[] args) {
     food2 c = new product1()   ;
     c.nonveg();
     c.veg();
     c.junkfood();
     c.snacks();
    }
}
