import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //입력받을 배열
        char[][] arr = new char[5][15];
        int max = 0;

        // 5줄을 반복
        for (int i = 0; i < 5; i++) {
            //한 줄 입력
            String word = sc.next();
            //한 줄의 최대 길이
            max = Math.max(max, word.length());

            //한 글자씩 입력
            for (int j = 0; j < word.length(); j++) {
                arr[i][j] = word.charAt(j);
            }
        }

        //출력부분
        for (int j = 0; j < max; j++) {
            for (int i = 0; i < 5; i++) {
                //초기 값이 '\0'인경우 다음 배열값 출력
                if (arr[i][j] == '\0') {
                    continue;
                }
                System.out.print(arr[i][j]);
            }
        }
        sc.close();
    }
}
