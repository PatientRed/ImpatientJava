package abc1.ch4;

public enum Color {
    BLACK(0, 0, 0), RED(255, 0, 0), BLUE(0, 0, 255),
    GREEN(0, 255, 0), YELLO(0, 255, 255), WHITE(255, 255, 255);
    private int red;
    private int green;
    private int blue;

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    Color(int r, int g, int b) {
        red = r;
        green = g;
        blue = b;
    }
}
