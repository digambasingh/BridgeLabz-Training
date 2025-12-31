package com.bridgelabz.scenarionbased;


class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}



class Line {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double calculateLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}


public class GeometryTest {
    public static void main(String[] args) {

        Point p1 = new Point(2, 3);
        Point p2 = new Point(6, 7);

        Line line = new Line(p1, p2);

        System.out.println("Length of the line: " + line.calculateLength());
    }
}

