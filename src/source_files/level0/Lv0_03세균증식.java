package source_files.level0;
/*[0단계] 세균증식*/
public class Lv0_03세균증식 {
    public static void main(String[] args) {
        int N = 3;
        int T = 5;
        System.out.println(solution(N,T));
    }
    private static int solution(int n, int t) {

        for(int i=0;i<t;i++){
            n=n*2;
        }
        return n;
    }
}
