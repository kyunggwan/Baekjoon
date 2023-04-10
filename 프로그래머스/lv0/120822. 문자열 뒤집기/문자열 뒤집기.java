class Solution {
    public String solution(String my_string) {
        String answer = "";
        int[] arr = new int[1000];
        
        // 배열에 넣어서
        for(int i = my_string.length() - 1; i >= 0; i--) {
            arr[my_string.length() - i - 1] = my_string.charAt(i);
        }
        
        // 문자열로 변환
        for(int i = 0; i < my_string.length(); i++) {
            answer += (char)arr[i];
        }
        
        return answer;
    }
}
