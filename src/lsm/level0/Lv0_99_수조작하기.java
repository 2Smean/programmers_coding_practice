package lsm.level0;

public class Lv0_99_수조작하기 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawwdsa";
        System.out.println(solution(n,control));
    }
    private static int solution(int n, String control) {
        for(int i=0;i<control.length();i++){
            char ch = control.charAt(i);
            if(ch == 'w'){
                n = n + 1;
            }else if(ch == 's'){
                n = n - 1;
            }else if(ch == 'd'){
                n = n + 10;
            }else if(ch == 'a'){
                n = n - 10;
            }
        }
        return n;
    }
}
