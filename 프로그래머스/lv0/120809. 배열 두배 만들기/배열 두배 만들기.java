class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = numbers;
        
        for(int loop = 0; loop < answer.length; loop++){
            answer[loop] *= 2;
        }
        
        return answer;
    }
}