class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char isChar = 'l';
        char replaceChar = 'l';

        for(int i = 0 ; i < myString.length(); i++){
            char currentChar  = myString.charAt(i);
            if(currentChar >= isChar){
                sb.append(currentChar);
            } else {
                sb.append(replaceChar);
            }
        }

        return sb.toString();
    }
}
