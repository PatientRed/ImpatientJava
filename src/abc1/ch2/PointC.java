package abc1.ch2;

public class PointC {
    private double x;
    private double y;

    public PointC(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void translate(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void scale(double factor) {
        x *= factor;
        y *= factor;
    }

    @Override
    public String toString() {
        return "PointC{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
