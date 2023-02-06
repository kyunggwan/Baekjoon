import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int [10];
        int count = 0;
        int temp = 0;
        //숫자 10개를 입력받는다.
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt() % 42;
        }
        //인덱스 10개를 돌아가면서 나타낸다.
        for(int i = 0 ; i < 10; i++){
            //인덱스 별로 요소를 비교하는데, 같은 값이 있으면 temp를 증가시킨다.
            //다음 요소로 갈 때마다 temp는 초기화된다.
            temp = 0;
            for(int k= i+1; k < 10; k++){
                if (arr[i] == arr[k]) {
                    temp ++;
                }
            }
            //만약 서로 다른 값(나머지)이면 count를 증가시킨다.
            if(temp == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}

