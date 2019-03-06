package com.alhusseiny;

public class Functions {
    //drone
    //access modifiers

    private double volumeSphere(double radius){
        double volume = 22/7.0 * Math.pow(radius,3) * 4/3.0;
        return  volume;

    }
    public static double areaCircle(double radius){
    double area=22/7.0 * radius * radius;
        System.out.println(area);
        return area;

    }
    public static void main(String[] args) {
        //objects == Variables
        Functions f = new Functions(); //create object
        System.out.println(f.volumeSphere(5));
        double v = f.volumeSphere(11);
        Functions.areaCircle(7);

        /*areaCircle(7);
        areaCircle(9.1);
        areaCircle(106.43);
        double result = areaCircle(11.114556);
        System.out.println( Math.round(result) );
        System.out.println( result * 12);
        */


    }
}
