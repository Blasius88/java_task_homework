package Task_3_2.Task3_3;

public class Task3_3 {
    public static void main(String[] args) {
        System.out.print("Введите размер массива ");
        int a = Integer.parseInt(Other.Scann.Scan());
        int[] arr = Other.Scann.ArrRand(a);
        int maxPosit = 0;
        int minPosit = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPosit = i;

            }
            if (arr[i] > max) {
                max = arr[i];
                maxPosit = i;
            }
        }
        int amount = 0;
        if (maxPosit+1 == minPosit || maxPosit == minPosit+1)
        {
            System.out.println("Между мин и макс элементами нет значений");
        }
        else if (maxPosit < minPosit) {
            amount = Amount(arr, maxPosit, minPosit);
        }
        else if (maxPosit > minPosit)
        {
            amount = Amount(arr, minPosit, maxPosit);
        }
        if (amount != 0)
        {
            System.out.println("Сумма =" + amount);
        }
    }


    static int Amount(int[] arr, int a, int b) {
        int amount = 0;
        for (int i = a + 1; i < b; i++) {
            amount += arr[i];
        }
        return amount;
    }
}
