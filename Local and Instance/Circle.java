public class Circle {
    

    int radius;  //instance 

    Circle(){
        System.out.println("Constructor of Circle");
    }

    public void setRadius(int radius){  //rad -- local
        this.radius=radius;
    }

    public void area(){
        double area=Math.PI*radius*radius;
        System.out.println("Area of Circle is  "+area);
    }


}
