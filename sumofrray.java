package arrays;

public class sumofrray {
    public static void main(String[] args) {
        int[] arr = {2 ,4 ,5 ,56, 7,89,34};
        int sum = 0;
        for(int i = 0 ; i<arr.length ; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
       
       
}
