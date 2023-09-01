class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int [10001];
        int index = 0;
        for(int i = 0 ; i < arr.length; i++){
           for(int j = 0 ; j < arr[i]; j++){
               answer[index++] = arr[i];
           }
        }
        
        int[] result = new int [index];
        for(int i = 0; i < index; i++){
            result[i] = answer[i];
        }
        return result;
    }
}