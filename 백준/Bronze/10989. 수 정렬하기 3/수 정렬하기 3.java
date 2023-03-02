import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
//
//        //리스트를 만들어서 입력
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < a; i++) {
//            list.add(Integer.parseInt(br.readLine()));
//        }
//        //정렬
//        Collections.sort(list);
//
//        for (int i = 0; i < a; i++) {
//            sb.append(list.get(i)).append('\n');
//        }
//        //출력
//        System.out.println(sb);

        //배열로 입력
        int[] arr = new int[a];

        //배열에 입력함
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //정렬
        Arrays.sort(arr);

        for (int i = 0; i < a; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);

    }
}
