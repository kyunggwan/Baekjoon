class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        String answer = "";
        String [] arr = my_string.split("");
        for(int i = 0 ; i < my_string.length(); i++){
            if(arr[i].equals("a")){
                continue;
            } else if(arr[i].equals("e")){
                continue;
            }else if(arr[i].equals("i")){
                continue;
            }
            else if(arr[i].equals("o")){
                continue;
            }
            else if(arr[i].equals("u")){
                continue;
            } else {
                sb.append(arr[i]);
            }
        }
        answer = sb.toString();
        
        return answer;
    }
}