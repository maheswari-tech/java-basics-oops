class Sample1{
    void m1(){
        System.out.println("This is Sample1  m1()");
    }
}
class Sample2 extends Sample1{
    void m1(){
        System.out.println("This is sample2 m1()");
    }
}
class MethodOverridingDemo
{ public static void main(String [] args){
    Sample2 s2 = new Sample2();
    s2.m1();
}
}
