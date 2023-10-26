class Solution {
    public int[] solution(int n, int[] numlist) {
        
        int count = 0;
        // 배열을 확인하면서 n으로 나누어지는지 확인한 뒤 배열에 넣음
        
        for(int i = 0 ; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                count++;
            }
        }
        
        int[] answer = new int[count];
        int index = 0;
        for(int i = 0 ; i < numlist.length; i++){
            if(numlist[i] % n ==0){
                answer[index] = numlist[i];
                index++;
            }
        }
        
        
        return answer;
    }
}