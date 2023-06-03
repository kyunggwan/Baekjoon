class Solution {
    public String solution(String s) {
        String answer = "";
        boolean isEven = true;
        StringBuilder sb = new StringBuilder();
        char [] str = s.toCharArray();
        
        
        for(int i = 0; i < s.length(); i++){
            
            if(Character.isWhitespace(str[i])){
                sb.append(" ");
                isEven = true;
            } else {
            if(isEven){
                sb.append(Character.toUpperCase(str[i]));
            } else {
                sb.append(Character.toLowerCase(str[i]));
            }
                isEven = !isEven;
                }
        }
        
        answer = sb.toString();
        return answer;
    }
}