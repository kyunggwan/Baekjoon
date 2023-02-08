import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            int num2 = sc.nextInt();
            int[] arr = new int[num2];

            double sum = 0;

            for (int j = 0; j < num2; j++) {
                int subject = sc.nextInt();
                arr[j] = subject;
                sum += subject;
            }

            double mean = (sum / num2);
            double count = 0;

            for (int x = 0; x < num2; x++) {
                if (arr[x] > mean) {
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count / num2) * 100);
        }
    }
}
