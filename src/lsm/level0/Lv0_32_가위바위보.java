package lsm.level0;
/*Hashmap 이 바로 떠올랐어야했다
* private static String solution(String rsp) {

        String answ = "";

        HashMap<String,String> map = new HashMap<>();
        map.put("2","0");
        map.put("0","5");
        map.put("5","2");


        for (int i = 0; i < rsp.length(); i++) {
            if(map.containsKey(String.valueOf(rsp.charAt(i)))){
                answ += map.get(String.valueOf(rsp.charAt(i)));
            }
        }

        return answ;
    }*/
public class Lv0_32_가위바위보 {
    public static void main(String[] args) {
        String rsp = "205";
        System.out.println(solution(rsp));
    }
    private static String solution(String rsp) {
        String answer = "";
        for(int i=0;i<rsp.length();i++){
            char ch = rsp.charAt(i);
            if( ch == '2'){
                answer = answer + "0";
            }else if( ch == '0'){
                answer = answer + "5";
            }else if( ch == '5'){
                answer = answer + "2";
            }
        }
        return answer;
    }
}
