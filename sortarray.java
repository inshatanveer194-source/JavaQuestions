package arrays;


import java.util.Arrays;

public class sortarray {
    public static void main(String[] args) {
        int[]arr = {20,50,40,30};
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i = 0; i<arr.length;i++){
           
            System.out.print( arr[i]+ " ");
        }

    }
}
