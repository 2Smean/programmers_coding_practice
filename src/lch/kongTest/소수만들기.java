package lch.kongTest;

public class 소수만들기 {

    private static int cnt;
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        dfs(nums,0,0,0);
        return cnt;
    }

    private static void dfs(int[] nums,int sum,int depth,int now) {
        if(depth == 3){
            if(isPrime(sum)){
                cnt++;
            };
            return;
        }
        for (int i = now; i < nums.length; i++) {
            dfs(nums,sum + nums[i],depth + 1,i+1);
        }
    }
    private static boolean isPrime(int sum) {
        for (int i = 2; i < sum-1; i++) {
            if(sum%i == 0) return false;
        }
        return true;
    }
}
