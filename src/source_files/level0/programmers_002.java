package source_files.level0;
/*[0단계] 중복된 숫자 개수*/
public class programmers_002 {
    public static void main(String[] args) {
        int[] array = {2,2,3,4,5,6};
        int N = 2;
        System.out.println(solution(array,N));
    }

        private static int solution(int[] array, int n) {
            int answer = 0;
            for(int i = 0;i<array.length;i++){
                if( array[i] == n ) {
                    answer++;
                }
            }
            return answer;
        }
}
