import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문자 입력
        String input = br.readLine();
        //입력된 문자 공백으로 구분해서 배열에 입력
        String[] tokens = input.split(" ");
        //거꾸로 저장함
        int num1 = Integer.parseInt(new StringBuilder(tokens[0]).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder(tokens[1]).reverse().toString());
        //큰 수
        int max = Math.max(num1, num2);
        //출력
        System.out.println(max);
    }
}

