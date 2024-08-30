package lsm.level1;

public class Lv1_10_서울에서김서방찾기 {

    private static String solution(String[] seoul) {
        // "Kim"의 위치를 찾습니다.
        int index = -1;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
                break;
            }
        }

        // 결과 문자열을 반환합니다.
        return "김서방은 " + index + "에 있다";
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));  
    }
}
