public class Point {

    private final double x;
    private final double y;

    public Point(double x, double y) {

        if (Double.isNaN(x) || Double.isNaN(y)) {
            throw new IllegalArgumentException("NaN недопустим");
        }

        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //FIX_ME: лишнее в данном задании
    //public void setX(double x) { this.x = x; }
    //public void setY(double y) { this.y = y; }

    @Override
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}