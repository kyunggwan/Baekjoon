import java.util.HashSet;
class Solution {
    public int[] solution(int n, String[] words) {
        int x = 0;
        int y = 0;                       
        // answer 배열 = [가장먼저 탈락하는 n의 번호, 몇번째 차례에 탈락했는지]

        // 안맞는 단어의 index를 구하자
        int index = 0;
        
        // 중복 부분 검사
        HashSet<String> usedWords = new HashSet<>();
        
        // 첫 단어의 첫 글자 , 끝 글자
        usedWords.add(words[0]);
        char lastLetter = words[0].charAt(words[0].length() - 1);
        
        // 규칙 검사
        for(int i = 1 ; i < words.length; i++){
          char firstLetter = words[i].charAt(0);
            
       // 끝말잇기 규칙 위반 혹은 단어 중복인 경우
            if (lastLetter != firstLetter || usedWords.contains(words[i])) {
                x = (i % n) + 1;
                y = (i / n) + 1;
                break;
            }
            lastLetter = words[i].charAt(words[i].length() -1);
            usedWords.add(words[i]);
        }
        int[] answer ={x,y};
        return answer;
    }
}