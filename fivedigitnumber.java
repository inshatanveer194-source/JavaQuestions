package conditionals;
import java.util.*;
public class fivedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();

        if(n>9999 && n<100000){
            System.out.println("The number is five digit ");
        }else{
            System.out.println("The number is not five digit ");
        }
    }
}
