import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //수 입력 받음
        int num = Integer.parseInt(br.readLine());
        System.out.println(Recursion(num));
    }

    static int Recursion(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return Recursion(num - 1) + Recursion(num - 2);
    }
}