import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        char[] str = s.toCharArray();
        int center = str.length / 2;
        if(str.length % 2 ==0){
            answer = sb.append(str[center-1]).append(str[center]).toString();
        } else {
           answer = String.valueOf(str[center]);
        }

        return answer;
    }
}