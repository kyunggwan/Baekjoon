class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length + 4) / 5]; // 그룹 수에 맞게 배열 크기 설정

        for (int i = 0; i < answer.length; i++) {
            answer[i] = names[i * 5]; // 현재 그룹의 첫 번째 이름을 답에 저장
        }

        return answer;
    }
}
