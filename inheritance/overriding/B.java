

public class B extends A{
    
    int x=20;

    B(){
        super(10);
        System.out.println("B()");
    }

    public void m1(){
        System.out.println("B-m1()");
    }

    public void m3(){
        // I need to add x from A and x from B
        int result=super.x+x;
        System.out.println(result);
      
        // I need to invoke m1() from A
        super.m1();
        // I need to invoke m1() from B
        m1();
    }
}
