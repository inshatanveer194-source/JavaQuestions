package arrays;

public class smallestofarray {
    public static void main(String[] args) {
        int[]arr = {4,5,3,2,6};
        int smallest = arr[0];
        for(int i = 1; i<arr.length ; i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
