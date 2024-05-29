package lsm.level0;

public class Lv0_122_날짜비교하기 {
    public static void main(String[] args) {
        int[] date1 = {2024, 12, 28};
        int[] date2 = {2024, 12, 29};
        System.out.println(solution(date1,date2));
    }
    private static int solution(int[] date1, int[] date2) {
        int answer = 0;
        int dateYear1 = 0;
        int dateMonth1 = 0;
        int dateDay1 = 0;
        int dateYear2 = 0;
        int dateMonth2 = 0;
        int dateDay2 = 0;


        for(int i=0;i<date1.length;i++){
            if (i == 0) {
                dateYear1 =  date1[i];
            } else if (i == 1) {
                dateMonth1 = date1[i];
            } else if (i == 2) {
                dateDay1 = date1[i];
            }
        }

        for(int i=0;i<date2.length;i++){
            if (i == 0) {
                dateYear2 =  date2[i];
            } else if (i == 1) {
                dateMonth2 = date2[i];
            } else if (i == 2) {
                dateDay2 = date2[i];
            }
        }

        if (dateYear1 < dateYear2) {
            answer = 1;
        } else if (dateYear1 == dateYear2) {
            if (dateMonth1 < dateMonth2) {
                answer = 1;
            } else if (dateMonth1 == dateMonth2) {
                if (dateDay1 < dateDay2) {
                    answer = 1;
                } else if (dateDay1 == dateDay2) {
                    return 0;
                }
            }
        }
        return answer;
    }
}
