import java.util.Arrays;
class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        Arrays.sort(box);
        answer = (box[2] / n) * (box[1] / n) * (box[0] / n);
        
        return answer;
    }
}