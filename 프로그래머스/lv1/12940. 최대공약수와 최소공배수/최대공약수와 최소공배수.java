class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer [0] = getGcd(n, m);
        answer [1] = n * m / answer[0];
        
        
        return answer;
    }
    
    // 유클리드 호제법, 최대공약수
    private int getGcd(int a, int b){
        while ( b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}