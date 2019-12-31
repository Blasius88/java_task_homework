package Task_3_2.Task3_10;

public class Task3_10 {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        int number = Integer.parseInt(Other.Scann.Scan());
        int factorial = 0;
        // расчет фактариала через for
        for (int i = 1; i <= number; i++)
        {
            factorial += number*i;
        }
        System.out.println("факториал =" + factorial);
        factorial = 0;
        int number1 = number;
        //расчет факториала через while
        while (number > 0)
        {
            factorial +=number*number1;
            number--;
        }
        System.out.println("факториал =" + factorial);
    }
}
