package lch.lv2;

import java.util.Arrays;

public class 방문길이 {
    public static void main(String[] args) {

        String dirs = "ULURRDLLU";
        System.out.println(solution(dirs));
    }



    private static int solution(String dirs) {
        int answer = 0;

        int[][] map = new int[21][21];
        map[map.length/2][map.length/2] = 1;

        String[] dirMap = dirs.split("");
        for (String dir : dirMap) {
            int nx = map.length/2;
            int ny = map.length/2;

            if(dir.equals("L")){

            }
            else if(dir.equals("U")){

            }
            else if(dir.equals("R")){

            }
            else {

            }

        }


        for (int i = 0; i < map.length; i++) {
            System.out.println(Arrays.toString(map[i]));
        }

        return answer;
    }
}
