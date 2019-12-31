package Task_3_2.Task3_2;

public class Task3_2 {
    public static void main(String[] args) {
        try {
            int count = 0;
            int a = 1;
            while (a < 100) {
                if (a % 13 == 0 || a % 17 == 0) {
                    count++;
                }
                a++;
            }
            int a1 = 0;
            a = 1;
            int[] arr = new int[count];
            for (int i = 0; i < 100; i++) {
                if (a % 13 == 0 || a % 17 == 0) {
                    arr[a1] = a;
                    a1 ++;
                }
                a ++;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
