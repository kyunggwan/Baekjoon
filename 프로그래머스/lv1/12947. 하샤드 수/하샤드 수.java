class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int cal = x;
        
        while(cal > 10){
            sum += cal % 10;
            cal /= 10;
        }
        
        sum = sum + cal;
        if(x % sum == 0 ){
            answer = true;
        } else{
            answer = false;
        }
        
        return answer;
    }
}