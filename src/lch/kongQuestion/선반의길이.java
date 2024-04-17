package lch.kongQuestion;

public class 선반의길이 {
    public static void main(String[] args) {
        int L = 3;
        int[] A = {50,100};
        System.out.println(solution(L,A));
    }

    private static int solution(int l, int[] a) {
        int answer = 0;
        int len = l - a.length;

        answer += len * 100;

        for (int i : a) {
            answer += (100-i);
        }



        return answer;

    }
}
