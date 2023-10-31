package homeworkweek7;

import java.awt.*;

//you have to represent a point in 2D space.
public class Program_16Point {
    int x;
    int y;
    public  Program_16Point() {//no arg constructor
       this (0,0) ;
    }
public Program_16Point ( int x,int y){
        this.x = x;
        this.y =y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x =x;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distance(){
        return Math.sqrt(this.x * this.x + this.y*this.y);
    }
    public double distance (int x,int y){
        return Math.sqrt((this.x -x)) * (this.x -x) + (this.y -y) *(this.y -y);

    }
    public double distance(Program_16Point xy){
        return Math.sqrt(this.x -xy.x) * (this.x - xy.x) + (this.y -xy.y) * (this.y - xy.y);
    }
public static void main(String[] args) {
    Point first = new Point(6, 5);
    Point second = new Point(3,1);
   System.out.println("distance (0,0)="+ first.distance(0,0));
    System.out.println("distance(second)= " + first.distance(second));
    System.out.println("distance(2,2)=" + first.distance(2,2));
    Point point = new Point();
    System.out.println("distance()= " + point.distance(point));

}
}