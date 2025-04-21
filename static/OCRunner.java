

public class OCRunner {
    public static void main(String[] args) {

        ObjectCounter.count=1000;

        ObjectCounter oc1,oc2,oc3;

        oc1=new ObjectCounter();
        oc1.incrementCount();

        oc2=new ObjectCounter();
        oc2.incrementCount();

        oc3=new ObjectCounter();
        oc3.incrementCount();
    }    
}
