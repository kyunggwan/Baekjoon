class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [num_list.length+1];
        int idx = num_list.length - 1;
        for(int i = 0 ; i < num_list.length; i++){
            answer[i] = num_list[i];
        }
        if(num_list[idx-1] >= num_list[idx]){
            answer[idx+1] = num_list[idx] * 2;
        } else {
            answer[idx+1] = num_list[idx] - num_list[idx-1];
        }
        return answer;
    }
}