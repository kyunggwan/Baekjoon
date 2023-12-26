import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        Arrays.sort(arr);
        
        // 배열에서 2개씩 가져와서 최소 공배수를 구한다
        int a = 0;
        int b = 0;
        
        for(int i = 0 ; i < arr.length - 1; i++){
            a = answer;
            b = arr[i + 1];
            
            answer = getLCM(a, b);
        }
        
        return answer;
    }
    
    public int getLCM(int a, int b){
        int GCD = getGCD(a, b);
        return a * b / GCD;
    }
    
    public int getGCD(int a, int b){
        if( a % b == 0){
            return b;
        }
        return getGCD(b , a % b);
    }
}