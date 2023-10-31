package program_20poolarea;

public class Rectangle {
    //write an application that calculates the volume of cuboid shaped pools

    double width = 5;
    double length = 10;
    public Rectangle(double width,double length){
        if ((width<0) && ( length<0)){
            this.width =0;
            this.length=0;
        }
    }
   public double getWidth(){
        return width;
   }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return width * length;

    }
}
