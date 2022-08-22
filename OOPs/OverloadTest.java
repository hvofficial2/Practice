class Parent{}
class Child extends Parent{}

public class OverloadTest {
    public void m1(Parent p){
        System.out.println("Parent");
    }
    public void m1(Child c){
        System.out.println("Child");
    }

    public static void main(String...args){
        OverloadTest ot = new OverloadTest();
        
        Parent p = new Parent();
        ot.m1(p);

        Child c = new Child();
        ot.m1(c);

        Parent pc = new Child();
        ot.m1(pc);
    }
}
