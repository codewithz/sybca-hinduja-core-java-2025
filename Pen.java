public class Pen {
    
    public void openCap(){
        System.out.println("Pen cap is opened");
    }

    public void closeCap(){
        System.out.println("Pen cap is closed");
    }

    public void write(){
        System.out.println("Pen is writing");
    }
    public static void main(String[] args) {
     Pen p;  //object creation | Objects are not operational
     p=new Pen(); //instance creation | Instance is operational
     p.write();
    }
}

