package arrays;

public class countpositive {
    public static void main(String[] args) {
        int [] arr ={-4 ,6,-7,4,6,-3};
        int count = 0;
        for(int i = 0;i<arr.length ;i++){
            if(arr[i]>0){
                count++;
            }
            
        }
        System.out.println(count);
    }

}
