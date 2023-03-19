import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //문자열 분리 메소드
        StringTokenizer st= new StringTokenizer(br.readLine(), " ");

        //갯수 출력
        System.out.println(st.countTokens());
        
    }
}
