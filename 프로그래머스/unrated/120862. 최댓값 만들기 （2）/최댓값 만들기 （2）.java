import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int max1 = numbers[numbers.length - 1];
        int max2 = numbers[numbers.length - 2];
        int min1 = numbers[0];
        int min2 = numbers[1];
        
        answer = Math.max(max1*max2, min1*min2);
        
        return answer;
    }
}