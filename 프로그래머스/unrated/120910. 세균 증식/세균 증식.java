class Solution {
    public double solution(int n, int t) {
        double answer =(double) n;
        double plus = Math.pow(2, t);
        answer = n * plus;
        return answer;
    }
}