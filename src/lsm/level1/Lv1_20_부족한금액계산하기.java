package lsm.level1;

public class Lv1_20_부족한금액계산하기 {

    private static long solution(int price, int money, int count) {
        // 총 이용 금액을 등차수열의 합 공식으로 계산
        long totalCost = (long) price * count * (count + 1) / 2;

        // 부족한 금액 계산 (부족하지 않으면 0을 반환)
        long deficit = totalCost - money;

        return deficit > 0 ? deficit : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));  
    }
}
