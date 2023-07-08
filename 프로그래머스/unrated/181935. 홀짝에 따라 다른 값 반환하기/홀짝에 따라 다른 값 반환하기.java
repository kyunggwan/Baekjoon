class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 짝수인 경우
        if(n % 2 == 0 ){
            // n까지 짝수의 제곱의 합
            for(int i = 0 ; i <= n; i++){
                if(i % 2 == 0)  answer += Math.pow(i, 2);   
                }
        }
        // 홀수인 경우
        else {
            // n까지 홀수의 합
            for(int i = 0 ; i <= n; i++){
                if(i % 2 == 1) answer += i;
            }
        }
        return answer;
    }
}