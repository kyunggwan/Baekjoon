class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        // replaceAll 문자 대체한다
        answer = my_string.replaceAll(letter,"");
        return answer;
    }
}