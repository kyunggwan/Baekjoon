import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        // 삭제할 원소들을 HashSet에 저장하여 효율적인 검사 가능
        java.util.HashSet<Integer> deleteSet = new java.util.HashSet<>();
        for (int num : delete_list) {
            deleteSet.add(num);
        }

        List<Integer> resultList = new ArrayList<>();

        for (int num : arr) {
            if (!deleteSet.contains(num)) {
                resultList.add(num);
            }
        }

        // 결과 배열로 변환
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] delete_list = {2, 4, 6};
        int[] result = solution.solution(arr, delete_list);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
