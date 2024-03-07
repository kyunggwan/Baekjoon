import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        // LinkedHashSet을 사용하여 중복 제거하고 순서를 유지합니다.
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        // 문자열을 순회하면서 중복을 제거합니다.
        for (char ch : my_string.toCharArray()) {
            uniqueChars.add(ch);
        }

        // LinkedHashSet을 문자열로 변환합니다.
        StringBuilder sb = new StringBuilder();
        for (char ch : uniqueChars) {
            sb.append(ch);
        }

        // 결과 문자열을 반환합니다.
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("my_string");
        System.out.println(result); // 결과 출력
    }
}
