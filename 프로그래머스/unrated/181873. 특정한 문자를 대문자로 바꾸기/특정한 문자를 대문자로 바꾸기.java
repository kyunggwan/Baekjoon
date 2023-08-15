class Solution {
    public String solution(String my_string, String alp) {
         if (alp.length() == 1 && Character.isLowerCase(alp.charAt(0))) {
            return my_string.replace(alp, alp.toUpperCase());
        }
        return my_string;
    }
}