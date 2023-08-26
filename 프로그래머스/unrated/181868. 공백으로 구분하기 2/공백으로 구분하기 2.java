class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        // 문자열 앞, 뒤의 빈 공백을 제거
        my_string = my_string.trim();
        answer = my_string.split("\\s+");
    
        return answer;
    }
}