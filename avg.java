package arrays;

public class avg {
    public static void main(String[] args) {
        int[]arr = {10,20,30,40,50};
        // sum of array
        // avg = sum of elements/no of elements
        int sum = 0 ;
        int n = arr.length;

        for(int i = 0; i<n ; i++){
            sum = sum + arr[i];
        }
        double avg = (double)sum/arr.length;
        System.out.println("Average " + avg);
    }
}
