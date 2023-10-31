package program_20poolarea;

public class Cuboid extends Rectangle{
double height = 5;
    public Cuboid(double width, double length,double height) {
        super(width, length);
        if (height<0){
            height =0;
        }else {
            height = height;

        }
    }
    public double getHeight(){

        return height;
    }
    public double getVolume(){
        return (getArea()* height);


    }
}

