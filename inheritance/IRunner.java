public class IRunner {
    public static void main(String[] args) {
        

        A a=new A();
        a.m1();
        a.m2();

        System.out.println("-----------Invoking using thr object of B---------------");

        B b=new B();
        b.m1();
        b.m2();
        b.m3();
        b.m4();


    }
}
