import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //문자 입력하고, 대문자로 변환
        String s = sc.next().toUpperCase();

        //알파벳을 담을 배열
        int[] arr = new int[26];

        //해당 인덱스 값 1 증가
        for(int i = 0 ; i < s.length(); i++){
            arr[s.charAt(i) - 'A']++;
        }

        int max = 0;
        char ch = '?';

        //알파벳을 순회하면서 ch문자를 해당 인덱스에 대응하는 문자로 대치
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                ch = (char) (i + 'A');
            } else if (arr[i] == max) {
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}
