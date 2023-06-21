import java.util.Arrays;
import java.util.Collections;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int max = -1;
        
        // 각 배열을 정렬한다.
        // A 배열은 오름차순, B는 역순
        Arrays.sort(A);
        Arrays.sort(B);
        reverseArray(B);
        
        // 두 배열의 요소를 곱한다
         for(int i = 0 ; i < A.length; i++){
             
                 int x = A[i] * B[i];
              answer += x;
             
         }
        
        return answer;
    }


    private void reverseArray(int[] a ){
        int start = 0;
        int end = a.length-1;
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }
}