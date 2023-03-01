import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        //몇개인지 입력 받는다.
        int num = sc.nextInt();

        //리스트에 입력
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }

        //정렬
        Collections.sort(list);

        //출력
        for (int i = 0; i < num; i++) {
            sb.append(list.get(i)).append('\n');
        }
        System.out.println(sb);
        sc.close();
    }
}
