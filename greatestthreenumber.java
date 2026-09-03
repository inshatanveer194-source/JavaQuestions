package conditionals;

import java.util.Scanner;

public class greatestthreenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a:");
        System.out.println("Enter the value b:");
        System.out.println("Enter the value c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("The value of a is greater");
        }if(b>c && b>a){
            System.out.println("The value of b is greater");
        
        }if(c>a && c>b){
            System.out.println("The value of c is greater");
        }
    }
}
