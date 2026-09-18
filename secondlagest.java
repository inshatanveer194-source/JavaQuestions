package arrays;

public class secondlagest {
    public static void main(String[] args) {
        int arr[] = { 20,50,60,48,55};
        int largest = arr[0];
        int secondlargest = arr[0];
        for(int i = 1; i<arr.length ; i++){
            if(arr[i]>largest){
                largest= arr[i];
                
            }else if(arr[i]>secondlargest){
                secondlargest = arr[i];
            }
        }
    System.out.println("largest "+ largest);
    System.out.println("second largest" + secondlargest);

    }
}
