package programmers.hash;

import java.util.HashMap;

public class P1845 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {3,1,2,3};

        System.out.println(solution.solution(a));
    }
}


class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i );
        }


        return Math.min(map.size(), nums.length / 2);
    }
}