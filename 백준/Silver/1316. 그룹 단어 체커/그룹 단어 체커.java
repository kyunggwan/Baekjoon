import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);    // i번째 문자 저장

            // 앞선 문자와 i 번쨰 문자가 같지 않다면
            if (prev != now) {

                // 해당 문자가 처음 나오는 경우(false인 경우)
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev = now;
                }

                // 해당 문자가 이미 나온적이 있는 경우
                else {
                    return false; // 그룸 단어가 아님
                }

                // 앞선 문자와 i 번째 문자가 같다면
            } else {
                continue;
            }
        }

        return true;
    }

}
