class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        char [] temp = cipher.toCharArray();
        
        for(int i = 0 ; i < temp.length; i++){
            if((i+1) % code == 0){
                answer += temp[i];
            }
        }
        return answer;
    }
}