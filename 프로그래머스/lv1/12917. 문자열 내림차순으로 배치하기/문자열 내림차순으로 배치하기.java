import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        char [] str = s.toCharArray();
        Arrays.sort(str);
        answer = new StringBuilder(new String(str)).reverse().toString();
            
        return answer;
    }
}