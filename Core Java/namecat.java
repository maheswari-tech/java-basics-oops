//creating a normal class//
class display
{
    String name(String gname)//normal method with return type as java datatype-string//
    {
        String s = "Hello "+ gname;// specify the datatype each time//
        return s;// return because not a void//
    }
}
class namecat//main class//
{
    public static void main(String args[])//main method with only which you can compile and run java program//
    {
        display x = new display();//creating obj of the class display with new(operator) with reference x//
        String y = x.name("Maheswari");
        System.out.println(y);// printing//
    }
}