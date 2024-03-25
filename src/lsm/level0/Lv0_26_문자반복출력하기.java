package lsm.level0;
/*외부 for 문: 외부 for 문은 주로 데이터 구조의 각 요소를 순회합니다.
 이것은 주로 배열, 리스트, 문자열 등의 컬렉션을 순회할 때 사용됩니다.
 이 외부 for 문은 데이터 구조의 각 요소에 접근하여 내부 for 문에 대한 작업을 수행하게 됩니다.

내부 for 문: 내부 for 문은 외부 for 문이 현재 순회 중인 데이터 구조의 각 요소에 대한 작업을 수행합니다.
이것은 주로 각 요소에 대한 추가적인 계산, 변환 또는 조작을 수행할 때 사용됩니다.*/
public class Lv0_26_문자반복출력하기 {
    public static void main(String[] args) {
        String my_string = "hello";
        int n = 2;
        System.out.println(solution(my_string,n));
    }
    private static String solution(String my_string, int n) {
        String answer = "";
        for(int i=0;i<=my_string.length()-1;i++){
            for(int j=0;j<=n-1;j++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
