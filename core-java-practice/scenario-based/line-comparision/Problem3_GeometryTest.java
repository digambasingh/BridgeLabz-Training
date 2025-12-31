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
        Point p = (Point) o;
        return Double.compare(p.x, x) == 0 &&
               Double.compare(p.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}


class Line implements Comparable<Line> {

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
    public int compareTo(Line other) {
        // Preferred: compare by length
        int lengthComparison = Double.compare(this.length(), other.length());

        if (lengthComparison != 0) {
            return lengthComparison; // shorter < longer
        }

        // Same length → check endpoint equality (order-independent)
        boolean sameDirection =
                p1.equals(other.p1) && p2.equals(other.p2);

        boolean reverseDirection =
                p1.equals(other.p2) && p2.equals(other.p1);

        if (sameDirection || reverseDirection) {
            return 0; // truly equal lines
        }

        // Same length but different location → define consistent ordering
        int firstPointCompare = p1.hashCode() - other.p1.hashCode();
        if (firstPointCompare != 0) {
            return firstPointCompare;
        }

        return p2.hashCode() - other.p2.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        return compareTo((Line) o) == 0;
    }

    @Override
    public int hashCode() {
        // Order-independent hash
        return Objects.hash(p1) + Objects.hash(p2);
    }
}

public class Problem3_GeometryTest {
	public static void main(String[] args) {

        Line l1 = new Line(new Point(0, 0), new Point(3, 4)); // length = 5
        Line l2 = new Line(new Point(0, 0), new Point(6, 8)); // length = 10
        Line l3 = new Line(new Point(3, 4), new Point(0, 0)); // same as l1

        System.out.println(l1.compareTo(l2)); // < 0
        System.out.println(l2.compareTo(l1)); // > 0
        System.out.println(l1.compareTo(l3)); // 0
    }
}
