package lsm.level0;

public class Lv0_77_개미군단 {
    public static void main(String[] args) {
        int hp = 21;
        System.out.println(solution(hp));
    }
    private static int solution(int hp) {
        int generalAnt = 5;
        int soldierAnt = 3;
        int workerAnt = 1;

        int generalsNeeded = hp / generalAnt;
        int remainingHP = hp % generalAnt;

        if (remainingHP >= soldierAnt) {
            generalsNeeded++;
            remainingHP -= soldierAnt;
        }

        if (remainingHP >= workerAnt) {
            generalsNeeded += remainingHP;
        }

        return generalsNeeded;
    }
}
