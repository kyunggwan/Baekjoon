class Solution {
    public long solution(long n) {
        long answer = 0;
        //Math.sqrt(), Math.pow()
        // 제곱근이 없으면 -1 반환
        if (Math.sqrt(n) != (int) Math.sqrt(n)) return answer = -1;
        
        // 제곱근이면 문제풀기
        else {
            answer = (long)Math.pow(Math.sqrt(n) + 1, 2);
        }
        return answer;
    }
}