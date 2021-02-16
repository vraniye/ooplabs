package lab02;

public class Point3d extends Point2d{

    //объявление новой координаты
    private double zCoord;

    //обновленный конструктор инициализации
    public Point3d ( double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        zCoord = z;
    }

    //конструктор по умолчанию
    public Point3d () {
        this(0, 0, 0);
    }

    public double getZ () {
        return zCoord;
    }
    public void setZ ( double val) {
        zCoord = val;
    }


}