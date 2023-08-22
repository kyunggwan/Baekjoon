class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0 ; i < str_list.length; i++){
            // String s = str_list[i].replace(ex, "");
            if(!str_list[i].contains(ex)){
            answer.append(str_list[i]);
            }
        }
        return answer.toString();
    }
}