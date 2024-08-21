package org.example.entity;

public class Point {

    double x;
    double y;
    double z;

    public Point(){

    }
    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public  void print(){
        System.out.println("x="+x+"\n"+"y="+y+"\n"+"z="+z);
    }
}
