import java.util.*;
class Solution {
    
    public int[] solution(int[] progresses, int[] speeds) {
        
        int [] temp = new int [progresses.length];
       List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < progresses.length; i++){
            temp[i] = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
        }
        
        int count = 1;
        int maxday = temp[0];
        for(int i = 1 ; i < temp.length; i ++){
            
            if(temp[i] > maxday){
                list.add(count);
                count = 1;
                maxday = temp[i];
            } else {
                count++;
            }
        }
        list.add(count);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}