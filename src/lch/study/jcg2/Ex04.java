package lch.study.jcg2;

public class Ex04 {

    private static int[] isWhat;
    private static int point = -1;
    public static void main(String[] args) {
        isWhat = new int[10];
        int e = 0;
        into(5);
        into(2);


    }

    private static void into(int num) {
        if(point >= 10) System.out.println("FULL");
        isWhat[++point] = num;

        while (!isEmpty()){
            System.out.println(take());
        }
    }

    private static int take() {
        if(isEmpty()) System.out.println("Empty");
        return isWhat[point--];
    }

    private static boolean isEmpty() {
        if(point == -1) return true;
        return false;
    }
}
