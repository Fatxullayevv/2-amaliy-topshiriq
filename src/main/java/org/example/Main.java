package org.example;


import org.example.entity.Car;
import org.example.entity.Point;
import org.example.entity.TriangleCalculator;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Car car= new Car("Blue", "BMW", "5000$", "Avtomat");
        car.getInformation();

        System.out.println("_________________________________");
        TriangleCalculator triangleCalculator= new TriangleCalculator();
        System.out.println("Yuzi= "+triangleCalculator.calculateArea(13, 14));
        System.out.println("Perimetr= "+triangleCalculator.calculatePerimetr(13, 14));

        System.out.println("_________________________________");

        Point point = new Point(6, 7, 9);
        point.print();
    }
}