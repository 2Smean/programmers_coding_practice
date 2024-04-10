package lsm.level0;

public class Lv0_77_개미군단 {
    public static void main(String[] args) {
        int hp = 24;
        System.out.println(solution(hp));
    }
    private static int solution(int hp) {
        int generalAnt = 5;
        int soldierAnt = 3;
        int workerAnt = 1;

        int generalsNeeded = hp / generalAnt; //generalNeeded 는 4
        int remainingHP = hp % generalAnt; //remainingHP 는 3

        if (remainingHP >= soldierAnt) {//우선 soldierAnt 를 걸러서 수를 센다.
            generalsNeeded++; //위의 경우가 참이라면 generalsNeeded 에 1을 추가하고
            remainingHP -= soldierAnt; //추가되었으므로 기존의 나머지에서 soldierAnt 의 값을 뺀다
        }

        if (remainingHP >= workerAnt) { //remainingHp 에는 1의 값이 남아있으므로 해당 조건문 참
            generalsNeeded += remainingHP; // 3이하의 나머지는 몫에 더해주면 된다
        }

        return generalsNeeded;
    }
}
