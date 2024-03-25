package lsm.level0;
/*할인 계산법은 정가*(100% - 할인률%)로 계산하면 된다
  순서를 높은 것부터 조건을 줘야 오류가 나지 않는다*/
public class Lv0_19_옷가게할인받기 {
    public static void main(String[] args) {

    }
    public int solution(int price) {
        int answer = 0;
        int discount = 0;
        if(price>=500000){
            price*=0.8;
        }else if(price>=300000){
            price*=0.9;
        }else if(price>=100000){
            price*=0.95;
        }
        return price;
    }
}
