import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받는 숫자 갯수
        int num = Integer.parseInt(br.readLine());

        // 입력값 받기
        String input = br.readLine();

        // 공백으로 분리해서 배열에 저장
        StringTokenizer st = new StringTokenizer(input);
        int[] numbers = new int[num];

        for (int i = 0; i < num; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        // 검사하는 숫자 갯수
        int num2 = Integer.parseInt(br.readLine());

        // 검사값 입력 받기
        String input2 = br.readLine();
        StringTokenizer st2 = new StringTokenizer(input2);
        
        // HashSet을 사용하여 숫자를 저장
        HashSet<Integer> cardSet = new HashSet<>();
        for(int i = 0 ; i < num; i++){
            cardSet.add(numbers[i]);
        }
        // 각각의 숫자가 배열에 있으면 1, 없으면 0을 저장
        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for (int i = 0; i < num2; i++) {
            int searchNumber = Integer.parseInt(st2.nextToken());
            if(cardSet.contains(searchNumber)){
                sb.append(1).append(" ");
            } else{
                sb.append(0).append(" ");
            }
        }
        System.out.println(sb.toString());
    }

}
