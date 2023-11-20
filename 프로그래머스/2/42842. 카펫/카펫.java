class Solution {
    public int[] solution(int brown, int yellow) {
        int totalTiles = brown + yellow;
        int[] answer = new int[2];

        for (int i = 1; i <= totalTiles / 2; i++) {
            if (totalTiles % i == 0) {
                int j = totalTiles / i;
                int yellowTiles = (i - 2) * (j - 2);

                if (yellowTiles == yellow) {
                    answer[0] = j;
                    answer[1] = i;
                    break;
                }
            }
        }

        return answer;
    }
}
