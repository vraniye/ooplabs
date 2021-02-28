package lab02;

class Point3d extends Point2d{
    //объявление новой координаты
    private double zCoord;

    //обновленный конструктор инициализации
    public Point3d ( double x, double y, double z) {
        super(x, y);
        this.zCoord = z;
    }

    //конструктор по умолчанию
    public Point3d () {
        this(0, 0, 0);
    }

    //set`еры и get`еры
    public double getZ () {
        return zCoord;
    }
    public void setZ ( double val) {
        zCoord = val;
    }

    //метод, сравнивающий значения переменных
    public boolean compair(Point3d a){
        return (a.getX() == this.getX() && a.getY() == this.getY() && a.getZ() == this.getZ());
    }

    //метод, который вычисляет расстояние между двумя точками с точностью двух знаков после запятой
    public double distanceTo(Point3d a){
        return (Math.sqrt(Math.pow((a.getX()-this.getX()),2)+Math.pow((a.getY()-this.getY()),2)+Math.pow((a.getZ()-this.getZ()),2)));
    }
}