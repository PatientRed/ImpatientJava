package abc1.ch4;

public abstract class Shape {
    public Point point;

    public void moveBy(double x, double y) {
        point.x += x;
        point.y += y;
    }

    public abstract Point getCenter();
}

class Circle extends Shape {
    double radius;

    @Override
    public Point getCenter() {
        return point;
    }

    public Circle(Point center, double r) {
        point = new Point(center.x, center.y);
        radius = r;
    }
}
