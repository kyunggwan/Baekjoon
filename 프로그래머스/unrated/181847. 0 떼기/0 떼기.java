class Solution {
    public String solution(String n_str) {
        String answer = "";
        int index = 0;
        
      while(index < n_str.length() && n_str.charAt(index) == '0'){
          index++;
      }
        
        if(n_str.length() == index){
            answer = "0";
        } else {
            answer = n_str.substring(index);
        }
    
        return answer;
    }
}