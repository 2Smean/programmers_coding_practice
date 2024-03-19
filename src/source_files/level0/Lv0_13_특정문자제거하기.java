package source_files.level0;
/*java에서 특정문자를 제거할 때에는 replace 를 통해서
 해당 문자를 빈문자열로 변환할 수 있다
 프로그래머스를 풀면서 이렇게 메서드를 사용하는것보다
 좀 더 기본에 충실하기 위해서 for 문과 형변환을 적극적으로
 사용하기로 했다*/
public class Lv0_13_특정문자제거하기 {
//    public static void main(String[] args) {
//        String my_string = "hi my name is min";
//        String letter = "m";
//        System.out.println(solution(my_string,letter));
//    }
//    private static String solution(String my_string, String letter) {
//        String answer = "";
//        answer = my_string.replace(letter,"");
//        return answer;
//    }
    //기본기를 다룬 예제
    //문자를 문자열로 바꾸기 위해서 String.valueOf를 사용한다
    //문자의 요소를 뽑아내기 위해서 해당 문자.charAt을 사용한다
    //그리고 equals 로 비교한다
    public static void main(String[] args) {
        String myString = "success";
        String letters = "s";
        System.out.println(solution2(myString,letters));
    }

    private static String solution2(String my_string, String letter) {
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            String str = String.valueOf(my_string.charAt(i));
            if(!str.equals(letter)){
                answer += str;
            }
        }
        return answer;
    }
}
