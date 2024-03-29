package lch.lv2;public class K번째소수개수구하기 {
    public static void main(String[] args) {
        int n = 437674;
        int k = 3;
        System.out.println(solution(n,k));
    }

    private static int solution(int n, int k) {
        int ans = 0;
        String str = "";


        // k진법 변환 로직.
        while (n!=0){
            str = n%k + str;
            n/=k;
        }
        String[] parts = str.split("0");

        for (String part : parts) {
            if(part.equals(" ")) continue;
            if(isPrime(Long.parseLong(part))) ans++;
        }

        return ans;
    }

    private static boolean isPrime(long part) {
        if(part < 2) return false;

        for (int i = 2; i <=Math.sqrt(part); i++) {
            if(part%i ==0) return false;
        }
        return true;
    }
}
