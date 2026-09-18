package arrays;

public class countnegative {
    public static void main(String[] args) {
        int [] arr = { 2,-4,-5,6,-7,8,-9};
        int count = 0;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]<0){
                count++;
            }
        }
        System.out.println(count);
    }
}
