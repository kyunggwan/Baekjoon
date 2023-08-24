class Solution {
    public int solution(int[] num_list) {
        int oddSum = 0;  // 홀수 번째 원소들의 합
        int evenSum = 0; // 짝수 번째 원소들의 합

        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) { // 0부터 시작하는 인덱스를 사용하여 홀수/짝수 판별
                evenSum += num_list[i];
            } else {
                oddSum += num_list[i];
            }
        }

        return Math.max(oddSum, evenSum); // 두 합 중에서 큰 값을 반환
    }
}