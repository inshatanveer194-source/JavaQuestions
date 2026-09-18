package arrays;
public class replace0swith5{
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        for(int i= 0 ; i<arr.length ; i++){
            if(arr[i]==0){
                arr[i]=5;
            }
        }
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}