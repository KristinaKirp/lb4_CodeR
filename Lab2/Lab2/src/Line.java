public class Line {

    private Point startPoint;
    private Point endPoint;

    //FIX_ME: конструктор по умолчанию ломает код
    //public Line() {
    //    this.startPoint = new Point(0,0);
    //    this.endPoint = new Point(0,0);
    //}

    public Line(Point startPoint, Point endPoint) {
        setStartPoint(startPoint);
        setEndPoint(endPoint);
    }

    public Line(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Point getStartPoint() {
        //FIX_ME: утечка ссылки
        //return startPoint;
        return new Point(startPoint.getX(), startPoint.getY());
    }

    public Point getEndPoint() {
        //FIX_ME: утечка ссылки
        //return endPoint;
        return new Point(endPoint.getX(), endPoint.getY());
    }

    public void setStartPoint(Point startPoint) {
        //FIX_ME: передача ссылки
        //this.startPoint = startPoint;
        this.startPoint = new Point(startPoint.getX(), startPoint.getY());
    }

    public void setEndPoint(Point endPoint) {
        //FIX_ME: передача ссылки
        //this.endPoint = endPoint;
        this.endPoint = new Point(endPoint.getX(), endPoint.getY());
    }

    public int getDistance() {
        double dx = endPoint.getX() - startPoint.getX();
        double dy = endPoint.getY() - startPoint.getY();

        //FIX_ME: должен возвращаться int
        //return Math.sqrt(...)
        return (int) Math.round(Math.sqrt(dx * dx + dy * dy));
    }

    @Override
    public String toString() {
        return "Линия от " + startPoint + " до " + endPoint;
    }
}