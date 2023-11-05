class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        
        while( age > 0){
            int remainder = age % 10;
            char ch = (char) ('a' + remainder);
            result.insert(0, ch);
            age /= 10;
        }
        answer = result.toString();
        return answer;
    }
}