package arrays;

public class oddcount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1};
        int count = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]%2!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
