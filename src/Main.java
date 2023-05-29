import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
    }

    //Problem: Find the maximum element in a 2D array.

    int[][] arr = {
            {2,31,4},
            {4,1,6,7},
            {23,53,65}
    };
    private  static void TwDArray(int[][] arr){
        int max = 0;
        for(int i = 0; i< arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
            for (int j =0; j<arr[i].length; j++){
                System.out.println(arr[j]);
            }
        }
    }
}