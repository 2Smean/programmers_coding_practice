package lsm.level0;
/*형변환을 통한 정수 추출*/
public class Lv0_35_정수부분 {
    public static void main(String[] args) {
        double flo = 4.14;
        System.out.println(solution(flo));
    }
    private static int solution(double flo) {
        int answer = (int) flo;
        return answer;
    }
}
