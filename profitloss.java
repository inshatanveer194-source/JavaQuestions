package conditionals;
import java.util.Scanner;

public class profitloss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cp :");
        int cp = sc.nextInt();
        System.out.print("Enter the sp :");
        int sp = sc.nextInt();

        if(cp>sp){
            System.out.print("The Loss is :");
            System.out.println(cp-sp);
        }if(sp>cp){
            System.out.print("The Profit is : ");
            System.out.println(sp-cp);
        }if(sp==cp){
            System.out.println("No profit no loss");
        }

    }
}