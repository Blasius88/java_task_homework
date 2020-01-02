package Task_4_1;

public class Rectangle {

    static double Area() {
        Point[] objects = Points();
        double[] distance = Distance(objects);
        double p = (distance[0] + distance[1] + distance[2]) / 2;
        double area = Math.sqrt(p * (p - distance[0]) * (p - distance[1]) * (p - distance[2]));
        return area;
    }

    static double[] Distance(Point[] points) {
        double[] distance = new double[3];
        for (int i = 0; i < distance.length; i++) {
            if (i == distance.length - 1) {
                distance[i] = Task4_1.Distance(points[0], points[i]);
            } else
                distance[i] = Task4_1.Distance(points[i], points[i + 1]);
        }
        return distance;
    }

    static Point[] Points() {
        Point[] objects = new Point[3];
        for (int i = 0; i < objects.length; i++) {
            System.out.print("Введите " + (i + 1) + " точку \n");
            objects[i] = (Point) Task4_1.Coordinates();
        }
        return objects;
    }

    public static double Length() {
        Point[] objects = Points();
        double[] distance = Distance(objects);
        double p = distance[1];
        return p;
    }

}
