class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            if (i < len - n) {
                answer[i] = num_list[i + n];
            } else {
                answer[i] = num_list[i - (len - n)];
            }
        }

        return answer;
    }
}
