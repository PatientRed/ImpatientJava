package abc1.ch2;

public record Point(double x, double y) {
    public Point translate(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(double factor) {
        return new Point(x * factor, y * factor);
    }
}
