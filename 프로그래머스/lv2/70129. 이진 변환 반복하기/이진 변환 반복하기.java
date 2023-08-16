class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")){
            int beforeLength = s.length();
        // 1. 0을 제거
        s = s.replace("0", "");
        answer[1] += beforeLength - s.length();
        
        // 2. 제거한 값의 길이를 2진 변환
        s = Integer.toBinaryString(s.length());
        answer[0] ++;
        }
        
        return answer;
    }
}
