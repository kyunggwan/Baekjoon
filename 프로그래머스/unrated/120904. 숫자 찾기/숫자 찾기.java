class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int index = 0;
        
        String numStr = Integer.toString(num);
        char arr[] = numStr.toCharArray();
        
        for(int i = 0 ; i < arr.length; i++){
            if (arr[i] == (char)(k + '0')) {
                answer = i+1;   
                break;
            }

        }
        
        return answer;
    }
}