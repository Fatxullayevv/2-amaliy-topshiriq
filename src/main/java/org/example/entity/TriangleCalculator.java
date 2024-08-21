package org.example.entity;

public class TriangleCalculator {
    double base;
    double height;

    public TriangleCalculator(){

    }

    public TriangleCalculator(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double hypotenuse = Math.sqrt(base * base + height * height);

    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public double calculatePerimetr(double base, double height){
        return base+ height+ hypotenuse;
    }

    public double calculateArea( int base, int height) {
        return 0.5 * base * height;
    }

    public double calculatePerimetr(int base, int height){
        return base + height + hypotenuse;
    }

    public double calculateArea( float base, float height) {
        return 0.5 * base * height;
    }

    public double calculatePerimetr(float base, float height){
        return base + height + hypotenuse;
    }

    public double calculateArea( long base, long height) {
        return 0.5 * base * height;
    }

    public double calculatePerimetr(long base, long height){
        return base + height + hypotenuse;
    }


}
