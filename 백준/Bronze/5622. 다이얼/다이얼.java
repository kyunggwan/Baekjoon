import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열을 입력
        String str = br.readLine();
        //한 문자씩 배열에 저장
        char[] arr = str.toCharArray();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 'A':
                case 'B':
                case 'C':
                    sum += 2;
                    count++;
                    break;
            }
            switch (arr[i]) {
                case 'D':
                case 'E':
                case 'F':
                    sum += 3;
                    count++;
                    break;
            }
            switch (arr[i]) {
                case 'G':
                case 'H':
                case 'I':
                    sum += 4;
                    count++;
                    break;
            }
            switch (arr[i]) {
                case 'J':
                case 'K':
                case 'L':
                    sum += 5;
                    count++;
                    break;
            }
            switch (arr[i]) {
                case 'M':
                case 'N':
                case 'O':
                    sum += 6;
                    count++;
                    break;
            }
            switch (arr[i]) {
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    sum += 7;
                    count++;
                    break;
            }
            switch (arr[i]) {
                case 'T':
                case 'U':
                case 'V':
                    sum += 8;
                    count++;
                    break;
            }
            switch (arr[i]) {
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    sum += 9;
                    count++;
                    break;
            }
        }
        System.out.println(sum + count);
    }
}
