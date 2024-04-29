import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 중복 제거 배열
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        // 중복을 제거하고, 종류 개수 확인
        int count = set.size();
        
        // 종류 개수와 N/2중 작은 것 선택
        answer = Math.min(nums.length / 2, count);
        
        return answer;
    }
}