class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        int index = 0;
        for(int i = 0 ; i < finished.length; i++){
            if(!finished[i]){
                index++;
            }
        }
        
        String[] answer = new String[index];
        int index2 = 0;
        
        for(int i = 0 ; i < todo_list.length; i++){
            if(!finished[i]){
                answer[index2] = todo_list[i];
                index2++;
            }
        }
        return answer;
    }
}