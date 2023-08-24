class Solution {
    public String solution(String myString) {
     StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            
            if (ch == 'a' || ch == 'A') {
                result.append('A');
            } else if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}