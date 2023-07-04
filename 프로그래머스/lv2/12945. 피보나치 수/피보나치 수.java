class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        
        if (n == 0) {
            answer = 0;
        } else if (n == 1) {
            answer = 1;
        } else {
            for (int i = 2; i < n+1; i++) {
                arr[i] = arr[i-1] + arr[i-2];
                arr[i] %= 1234567;
            }
            answer = arr[n] % 1234567;
        }
        
        return answer;
    }
}
