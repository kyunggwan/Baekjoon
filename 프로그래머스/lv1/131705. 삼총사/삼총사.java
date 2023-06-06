class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int index = 0;
        for(int i = 0 ; i < number.length; i++){
            for(int j = i+1 ; j < number.length-1; j++){
                for( int k = j+1 ; k < number.length; k++){
                    if(number[i]+number[j]+number[k] == 0){
                        index++;
                    }
                }
            }
        }
        return answer = index;
    }
}