package source_files.level0;
/*나머지가 0이라면 정량을 주문하면 되고 나머지가 있다면 +1을 통해 계산한다*/
public class Lv0_12_피자나눠먹기3 {
    public static void main(String[] args) {
        int slice = 2;
        int n = 30;
        System.out.println(solution(slice,n));
    }
    private static int solution(int slice, int n) {
        int answer = 0;
        if(n % slice == 0){
            answer = n / slice;
        }else{
            answer = n / slice+1;
        }
        return answer;
    }
}
