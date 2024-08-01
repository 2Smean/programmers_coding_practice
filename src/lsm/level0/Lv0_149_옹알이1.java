package lsm.level0;

public class Lv0_149_옹알이1 {
    public static void main(String[] args) {
        String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(babbling1));
    }

    private static int solution(String[] babbling) {
        int count = 0;
        String[] babbles = {"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            for (String babble : babbles) {
                word = word.replace(babble, " ");
            }
            word = word.replace(" ", "");
            if (word.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}
