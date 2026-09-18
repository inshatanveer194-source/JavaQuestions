package arrays;

public class nextgreatestelement {
    public static void main(String[] args) {

        int[] arr = {12, 8, 41, 60, 2, 49, 16, 28, 21};

        int n = arr.length;

        int[] ans = new int[n];

        ans[n - 1] = -1;

        int neg = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            ans[i] = neg;

            neg = Math.max(neg, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}