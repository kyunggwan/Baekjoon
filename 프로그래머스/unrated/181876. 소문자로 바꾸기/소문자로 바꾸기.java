class Solution {
    public String solution(String myString) {
        
        StringBuilder sb = new StringBuilder();
        char [] str = myString.toCharArray();
        for(int i = 0 ; i < str.length; i++){
            sb.append(Character.toLowerCase(str[i]));
        }
        return sb.toString();
    }
}