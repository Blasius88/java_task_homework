package Task_4_1;

public class Task4_1 {
    public static void main(String[] args) {
        System.out.print("1 - расчет длинны отрезка\n" +
                "2 - расчет площади треугольника \n" +
                "3 - расчет длины \n");
        int a = Integer.parseInt(Other.Scann.Scan());
        switch (a){
            case 1:
                Point one = new Point();
                System.out.println("Введите координаты 1 точки");
                one = (Point) Coordinates();
                Point two = new Point();
                System.out.println("Введите координаты 2 точки");
                two = (Point) Coordinates();
                System.out.print("Координаты 1 точки " + one.X + "," + one.Y + "\n");
                System.out.print("Координаты 2 точки " + two.X + "," + two.Y + "\n");
                System.out.println("Расстояние между точками: " + Distance(one, two));
                break;
            case 2:
                System.out.print("Площадь треугольника "+ Rectangle.Area() + "\n");
                break;
            case 3:
                System.out.print("Длинна диагонали "+ Rectangle.Length() + "\n");
                break;
        }
    }


    static Object Coordinates() {
        Point сoordinates = new Point();
        System.out.print("x = ");
        сoordinates.X = Integer.parseInt(Other.Scann.Scan());
        System.out.print("y = ");
        сoordinates.Y = Integer.parseInt(Other.Scann.Scan());
        return сoordinates;
    }

    public static double Distance(Point a, Point b) {
        double distance = 0;
        distance = Math.sqrt(Math.pow(b.X - a.X, 2) + Math.pow(b.Y - a.Y, 2));
        return distance;
    }


}
