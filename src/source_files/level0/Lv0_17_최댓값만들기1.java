package source_files.level0;
/* 원래 초기화할때 0으로 했었는데 배열이 음수일 가능성도 있기 때문에
   Integer.MIN_VALUE 를 사용해서 가장 작은 값으로 값을 초기화 해준다
   for-each 문을 활용하여 배열전체를 순회하며 최대값과 두번째 최대값을 찾아냈다*/
public class Lv0_17_최댓값만들기1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println(solution(numbers));
    }
    private static int solution(int[] numbers) {
        int answer = 0;
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int number : numbers){
            if(number>firstMax){
                secondMax = firstMax;
                firstMax = number;
            }else if(number>secondMax){
                secondMax = number;
            }
        }
        answer = firstMax*secondMax;
        return answer;
    }
}
