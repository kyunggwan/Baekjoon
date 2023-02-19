import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //몇번 반복할 지 입력받는다.
        int Num = sc.nextInt();

        for (int i = 0; i < Num; i++) {

            //문자를 몇번씩 반복할지 입력받는다.
            int R = sc.nextInt();
            //문자를 입력 받는다.
            String S = sc.next();

            //입력받은 문자를 반복해서 출력
            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
