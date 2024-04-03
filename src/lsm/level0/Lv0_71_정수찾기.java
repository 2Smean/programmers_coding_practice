package lsm.level0;
/*return 을 두번적었더니 반복문에서 i++이 비활성화가 되었다*/
public class Lv0_71_정수찾기 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int n = 3;
        System.out.println(solution(list,n));
    }
    private static int solution(int[] list, int n) {
        int answer = 0;
        for(int i=0;i<list.length;i++){
            if(list[i] == n){
                return 1;
            }
        }
        return answer;
    }
}
