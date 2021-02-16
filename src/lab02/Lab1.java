package lab02;

import java.util.Scanner;

public class Lab1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Point3d p1,p2,p3;
        double coords[] = new double[9];
        for(int i=0;i<3;i++){
            System.out.println("Координаты для точки p"+(i+1));
            System.out.println("Координата х: ");
            coords[i*3]=sc.nextDouble();
            System.out.println("Координата y: ");
            coords[i*3+1]=sc.nextDouble();
            System.out.println("Координата z: ");
            coords[i*3+2]=sc.nextDouble();
        }
        p1 = new Point3d(coords[0],coords[1],coords[2]);
        p2 = new Point3d(coords[3],coords[4],coords[5]);
        p3 = new Point3d(coords[6],coords[7],coords[8]);
        System.out.println("Первая точка с координатами x = "+p1.getX()+" y = "+p1.getY()+" z = "+p1.getZ());
        System.out.println("Вторая точка с координатами x = "+p2.getX()+" y = "+p2.getY()+" z = "+p2.getZ());
        System.out.println("Третья точка с координатами x = "+p3.getX()+" y = "+p3.getY()+" z = "+p3.getZ());

        if(p1.compair(p2) || p2.compair(p3) || p3.compair(p1)){
            System.out.println("Две точки равны");
        }
        else{
            double res=computeArea(p1,p2,p3);
            System.out.println("Площадь треугольника точек p1 p2 p3 = "+res);
        }

    }
    //Метод, вычисляющий площадь треугольника
    public static double computeArea (Point3d a, Point3d b, Point3d c){
        double distAB, distBC,distCA;
        double p;
        double res;
        distAB = a.distanceTo(b);
        distBC = b.distanceTo(c);
        distCA = c.distanceTo(a);
        p = (distAB+distBC+distCA)/2.0;
        res = Math.sqrt(p*(p-distAB)*(p-distBC)*(p-distCA));
        return res;
    }
}