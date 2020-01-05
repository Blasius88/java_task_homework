package Task_4_2.Task4_1;

public class Task4_1 {
    public static void main(String[] args) {
        runTime();
    }

    static void runTime() {
        System.out.println("Введите время в формате hh:mm:ss");
        String time = Other.Scann.Scan();
        String[] timeSplit = time.split(":");
        Time time1 = new Time();
        time1.hour = Integer.parseInt(timeSplit[0]);
        time1.minuts = Integer.parseInt(timeSplit[1]);
        time1.second = Integer.parseInt(timeSplit[2]);
        if (time1.hour > 23) {
            System.out.println("Неправельно введено время");
            return;
        }
        if (time1.minuts > 59) {
            System.out.println("Неправельно введено время");
            return;
        }
        if (time1.second > 59) {
            System.out.println("Неправельно введено время");
            return;
        }
        getTheFullNumberSec(time1);
        printTimeInSec(time1);
    }


    //Получение полного количества времени
    public static void getTheFullNumberSec(Time time) {
        System.out.println("Выводим время в секундах");
        int timeInSec = 0;
        if (time.second != 0) {
            timeInSec += time.second;
        }
        if (time.minuts != 0) {
            timeInSec += time.minuts * 60;
        }
        if (time.hour != 0) {
            timeInSec += time.hour * 60 * 60;
        }
        if (timeInSec != 0) {
            printTimeInSec(timeInSec);
        }
    }

    private static void printTimeInSec(int timeInSec) {
        //Конструктор который принемает 1 параметр
        System.out.println("Время в секундах = " + timeInSec);
    }

    public static void printTimeInSec(Time time) {
        System.out.println("Введеное время: " + time.hour + "ч " + time.minuts + "мин " + time.second + "сек");
    }

}
