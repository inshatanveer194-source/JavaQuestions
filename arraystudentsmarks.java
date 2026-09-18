package arrays;
public class arraystudentsmarks{
    public static void main(String[]args){
        int [] arr = {10,20,34,77,89,24,88};
        int n = arr.length;
        for(int i = 0 ; i <= n ; i++){
            if(arr[i]<35){
                System.out.println(i);
            }
        }
    }
}