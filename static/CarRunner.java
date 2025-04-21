

public class CarRunner {
    public static void main(String[] args) {
        Car c;
        c=new Car();
        String name=c.whatName();
        System.out.println("Name of car is "+name);

        //-------------------------------------------------------

        String nameOfCar=Car.whatName();
        System.out.println("Name of Car is [static] : "+nameOfCar);
    }
}
