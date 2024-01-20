class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 4 ; i <= n; i++){
            if(cal(i) >= 3){
                answer++;
            }    
        }
        return answer;
    }
    
     public int cal(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (i != n / i) { 
                    count++;
                }
            }
        }
        return count;
    }
}