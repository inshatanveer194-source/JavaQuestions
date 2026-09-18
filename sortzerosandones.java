package arrays;

public class sortzerosandones {
    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 1, 1, 0};

        int countzero = 0;

        // Step 1: Count zeros
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                countzero++;
            }
        }

        // Step 2: Put zeros first and ones after them
        for(int i = 0; i < arr.length; i++) {
            if(i < countzero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        // Step 3: Print array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}