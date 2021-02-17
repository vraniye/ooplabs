package lab02;

public class Point2d {
    //координаты точек x, y
    protected double xCoord;
    protected double yCoord;

    //конструктор инициализации
    public Point2d ( double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    //конструктор по умолчанию
    public Point2d () {
        this(0, 0);
    }

    //set`еры и get`еры
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }
    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }
}
