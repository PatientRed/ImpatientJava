package abc1.ch4;

import java.util.Objects;

public class Point {
    protected double x;
    protected double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(getX(), point.getX()) == 0 && Double.compare(getY(), point.getY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //for testing purpose
    public void setX(double x) {
        this.x = x;
    }

    //for testing purpose
    public void setY(double y) {
        this.y = y;
    }
}
