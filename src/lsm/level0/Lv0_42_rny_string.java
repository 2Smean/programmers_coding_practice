package lsm.level0;
/*m 인경우에 answer.append 로 추가하였는데 else 를 사용하여 나머지 처리를 해주지 않았더니
    rnrnrn 즉 m 만 rn 으로 바꿔주는 결과가 나왔다. 나머지도 잘 배치해주도록하자 !*/
public class Lv0_42_rny_string {
    public static void main(String[] args) {
        String rny = "mynameislsm";
        System.out.println(solution(rny));
    }
    private static String solution(String rny) {
        StringBuilder answer = new StringBuilder();

        for(int i=0;i<rny.length();i++){
            char ch = rny.charAt(i);
            if(ch == 'm'){
                answer.append("rn");
            }else{
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}
