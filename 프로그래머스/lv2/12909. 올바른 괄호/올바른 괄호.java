class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        // 문자를 배열로 받아서 검사
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '(') {
                count++;
            } else if (str[i] == ')') {
                count--;
            }
            
            // 괄호의 개수가 음수가 되면 균형이 깨진 것이므로 false 반환
            if (count < 0) {
                return false;
            }
        }

        // 괄호의 개수가 0이 아니면 균형이 깨진 것이므로 false 반환
        if (count != 0) {
            return false;
        }

        return answer;
    }
}
