package lsm.level0;

public class Lv0_72_배열비교하기 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(solution(arr1,arr2));
    }
    private static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1result = 0;
        int arr2result = 0;
        for(int i=0;i<arr1.length;i++){
            arr1result = arr1result + arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            arr2result = arr2result + arr2[i];
        }
        if(arr2.length > arr1.length){
            return -1;
        }else if(arr2.length == arr1.length){
            if(arr1result == arr2result){
                return 0;
            }else if(arr1result > arr2result){
                return 1;
            }
        }
        return answer;
    }

}

