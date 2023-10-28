class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] temp = my_string.toCharArray();
        
        for(int i = 0; i < my_string.length(); i++){
            if(Character.isUpperCase(temp[i])){
                temp[i] = Character.toLowerCase(temp[i]);
            } else {
                temp[i] = Character.toUpperCase(temp[i]);
            }
        }
        
        answer = String.valueOf(temp);
        
        return answer;
    }
}