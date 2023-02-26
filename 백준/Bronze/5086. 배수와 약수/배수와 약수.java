import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        //공식 입력
        while (((a = sc.nextInt()) != 0) && ((b = sc.nextInt()) != 0)) {
            if (a % b == 0) {
                System.out.println("multiple");
            } else if (b % a == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }
}
