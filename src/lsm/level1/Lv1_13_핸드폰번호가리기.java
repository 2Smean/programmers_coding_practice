package lsm.level1;

public class Lv1_13_핸드폰번호가리기 {

    private static String solution(String phone_number) {
        // 전화번호 길이 계산
        int length = phone_number.length();

        // 뒤 4자리 제외한 앞부분을 *로 치환
        String maskedPart = "*".repeat(length - 4);

        // 뒤 4자리
        String visiblePart = phone_number.substring(length - 4);

        // *로 치환한 부분과 뒤 4자리를 합쳐서 반환
        return maskedPart + visiblePart;
    }

    public static void main(String[] args) {
        // 테스트 출력
        System.out.println(solution("027778888"));   // *****8888
    }

}
