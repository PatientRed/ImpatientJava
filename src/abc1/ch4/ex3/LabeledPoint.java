package abc1.ch4.ex3;

import abc1.ch4.Point;

import java.util.Objects;

public class LabeledPoint extends Point {
    String label;

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LabeledPoint that = (LabeledPoint) o;
        return Objects.equals(getLabel(), that.getLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLabel());
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + label + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

//    public static double protectedTest(Point p) {
//        return p.x;
//    }

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }
}
