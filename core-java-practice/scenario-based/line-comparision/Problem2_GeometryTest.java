package com.bridgelabz.scenarionbased;


import java.util.Objects;

class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point other) {
        return Math.hypot(x - other.x, y - other.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
               Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        return p1.distanceTo(p2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        Line other = (Line) o;

        // Check endpoints in both directions
        boolean sameDirection =
                p1.equals(other.p1) && p2.equals(other.p2);

        boolean reverseDirection =
                p1.equals(other.p2) && p2.equals(other.p1);

        // Optional: length equality check (preferred per your requirement)
        boolean sameLength =
                Double.compare(this.length(), other.length()) == 0;

        return (sameDirection || reverseDirection) && sameLength;
    }

    @Override
    public int hashCode() {
        // Order-independent hash
        return Objects.hash(p1) + Objects.hash(p2);
    }
}



public class Problem2_GeometryTest {
	public static void main(String[] args) {
        Line l1 = new Line(new Point(0, 0), new Point(3, 4));
        Line l2 = new Line(new Point(3, 4), new Point(0, 0));

        System.out.println(l1.equals(l2)); // true
    }
}
