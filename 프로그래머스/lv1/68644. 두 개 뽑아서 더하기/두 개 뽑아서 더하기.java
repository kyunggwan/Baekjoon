import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        // Set에 넣어서 중복 제거
        Set<Integer> set = new HashSet<>();
        
        // 더한 값을 Set에 넣음
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }
        
        // answer 배열 생성
        int [] answer = new int [set.size()];
        int index = 0;
        
        // answer 배열에 input
        for(int num: set){
            answer[index++] = num;
        }
        
        // 정렬
        Arrays.sort(answer);
        return answer;
    }
}
