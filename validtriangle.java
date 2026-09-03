package conditionals;
import java.util.*;

public  class validtriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 side");
        int a = sc.nextInt();
        System.out.println("Enter the 2 side");
        int b = sc.nextInt();
        System.out.println("Enter the 3 side");
        int c = sc.nextInt();

        if(a+b >c && b+c>a && a+c>b) System.out.println("Valid Triangle");
        else System.out.println("Invalid Triangle");
    }
}

