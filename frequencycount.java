package arrays;

public class frequencycount {
    public static void main(String[] args) {
        int [] arr={4,3,4,5,6,7,4};
        int count= 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==4){
                count ++;
            }
        }
        System.out.println(count);
    }
}
