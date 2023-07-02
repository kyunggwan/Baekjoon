import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int answer = 0;
    public static int [] stack;
    public static int num;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        stack = new int [n];
        num = -1;

        for(int i = 0; i < n; i++){
            int input = Integer.parseInt(br.readLine());
            switch (input) {
                case 0:
                    pop();
                    break;
                default:
                    push(input);
                    break;
            }

        }
        System.out.println(answer);

    }

    public static void push(int a) {
        stack[num+1] = a;
        num++;
        answer += a;
    }

    public static void pop(){
        int popValue = stack[num];
        num --;
        answer -= popValue;
    }
}
