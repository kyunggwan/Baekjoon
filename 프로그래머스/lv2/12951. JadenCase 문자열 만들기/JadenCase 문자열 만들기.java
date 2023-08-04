class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] words = s.split(" ", -1);

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                answer.append(Character.toUpperCase(words[i].charAt(0)));
                answer.append(words[i].substring(1).toLowerCase());
            }
            // 마지막 단어가 아니라면 항상 공백을 추가
            if (i < words.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }
}
