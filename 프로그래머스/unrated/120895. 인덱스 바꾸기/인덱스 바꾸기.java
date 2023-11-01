class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] temp = my_string.toCharArray();
        char tempWord = 'ㅁ';
        
        tempWord = temp[num1];
        temp[num1] = temp[num2];
        temp[num2] = tempWord;
        
        answer = new String(temp);
        
        return answer;
    }
}