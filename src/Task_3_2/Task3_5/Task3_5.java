package Task_3_2.Task3_5;

public class Task3_5 {
    public static void main(String[] args) {
        {
            String a = "*";
            String b = " ";
            String[][] arr = new String[5][5];
            arr[0][0] = a;
            arr[0][1] = a;
            arr[0][2] = a;
            arr[0][3] = a;
            arr[0][4] = a;
            arr[1][0] = b;
            arr[1][1] = a;
            arr[1][2] = a;
            arr[1][3] = a;
            arr[1][4] = b;
            arr[2][0] = b;
            arr[2][1] = b;
            arr[2][2] = a;
            arr[2][3] = b;
            arr[2][4] = b;
            arr[3][0] = b;
            arr[3][1] = a;
            arr[3][2] = a;
            arr[3][3] = a;
            arr[3][4] = b;
            arr[4][0] = a;
            arr[4][1] = a;
            arr[4][2] = a;
            arr[4][3] = a;
            arr[4][4] = a;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.print("\n");
            }
        }
    }
}
