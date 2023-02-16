import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        String num = sc.next();
        int sum = 0;
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            sum += num.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
