package lsm.level0;

public class Lv0_84_꼬리문자열 {
    public static void main(String[] args) {
        String[] str = {"adv", "vdd", "ef"};
        String ex = "d";
        System.out.println(solution(str,ex));
    }
    private static String solution(String[] str, String ex) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<str.length;i++){//문자열끼리 비교할때에는 equals를 사용한다
            if(!str[i].contains(ex)){//포함되어있는지 확인할 때에는 contains를 사용한다
                answer.append(str[i]);
            }
        }

        return answer.toString();
    }
}
