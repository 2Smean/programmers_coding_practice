package source_files.level0;
/*
[0단계] 양꼬치
*/
public class Lv0_01양꼬치 {
    public static void main(String[] args) {
        int N = 10;
        int K = 0;
        System.out.println(solution(N,K));
    }
        private static int solution(int n, int k) {
            int answer = 0;
            if (n >= 10) {
                answer = (n * 12000) + (k * 2000) - ((n / 10) * 2000);
            } else {
                answer = (n * 12000) + (k * 2000);
            }
            return answer;
        }
}
