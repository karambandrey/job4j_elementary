package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double sqr = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return sqr;
    }

    public static void main(String[] args) {
        double sqr = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + sqr);
    }
}