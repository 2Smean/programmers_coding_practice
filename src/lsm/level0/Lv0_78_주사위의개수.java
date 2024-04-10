package lsm.level0;
/*if 문: 여러 개의 if 문은 각각의 조건을 독립적으로 평가하며, 모든 조건을 확인합니다.
따라서 여러 개의 if 문이 모두 실행될 수 있습니다.

else if 문: else if 문은 이전 조건이 거짓일 때만 조건을 평가합니다.
따라서 이전 조건이 참이면 다음 else if 문은 검사되지 않습니다. 이것은 각 조건이 상호 배타적일 때 주로 사용됩니다.

if 문과 else if 문을 상황에 따라서 사용할 수 있도록 연습하기

- 처음 푼 것 -
box[i] < n 의 return 0;에 대한 처리를 해주지않았고 또한 의미없는 분기를 태움
private static int solution(int[] box, int n) {
        int answer = 0;
        for(int i=0;i<box.length;i++){
            if(box[0] >= n){
                answer = box[0] / n;
            }

            if(box[1] >= n){
                answer = answer * (box[1] / n);
            }

            if(box[2] >= n){
                answer = answer * (box[2] / n);
            }
        }
        return answer;
    }*/
public class Lv0_78_주사위의개수 {
    public static void main(String[] args) {
        int[] box = {10, 8, 6};
        int n = 3;
        System.out.println(solution(box,n));
    }
    private static int solution(int[] box, int n) {
        int answer = 1;

        for (int i = 0; i < box.length; i++) {
            // box[i]가 n보다 작은 경우 삼항연산자를 이용해서 해결
            answer *= (box[i] >= n) ? (box[i] / n) : 0;
        }

        return answer;
    }
}
