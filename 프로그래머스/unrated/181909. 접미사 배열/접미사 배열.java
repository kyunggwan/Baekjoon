import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int length = my_string.length();
        String[] answer = new String[length];

        for (int i = 0; i < length; i++) {
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String myString = "dlrjf tnwjdgownj";
        String[] result = solution.solution(myString);

        // 출력 확인
        System.out.println(Arrays.toString(result));
    }
}
