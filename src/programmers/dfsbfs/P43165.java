package programmers.dfsbfs;

public class P43165 {
    public static int val = 0;

    public static void main(String[] args) {
        int[] a = {4,1,2,1};
        int target = 4;
        solution(a, target);

        System.out.println(val);
    }

        public static int solution(int[] numbers, int target) {
            answer(numbers,target, 0, 0);
            return val;
        }

        public static void answer(int[] numbers, int target, int sum, int num) {

            if(sum == numbers.length) {
                if(num == target) {
                    val++;
                }
                return;
            }
            System.out.println(sum);
            answer(numbers, target, sum + 1, num + numbers[sum]);
            answer(numbers, target, sum + 1, num - numbers[sum]);

        }
}
