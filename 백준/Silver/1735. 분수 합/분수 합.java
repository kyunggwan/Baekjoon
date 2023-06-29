import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 값 받아오기
        int a1, a2, b1, b2, answer1, answer2;

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        a1 = Integer.parseInt(st1.nextToken());
        a2 = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        b1 = Integer.parseInt(st2.nextToken());
        b2 = Integer.parseInt(st2.nextToken());
        // 분수 더하기
        int numerator;
        int denominator;
        if (a2 == b2) {
            numerator = a1 + b1;
            denominator = a2;
        } else {
            numerator = a1 * b2 + a2 * b1;
            denominator = a2 * b2;
        }

        // 기약분수로 만들기
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        System.out.println( numerator + " " + denominator);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return findGCD(b, a % b);
    }
}