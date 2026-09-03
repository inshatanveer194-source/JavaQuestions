package conditionals;
import java.util.*;
public class areaperimterofrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l+b);

        if(area > perimeter){
            System.out.println("The area is :" +area);
            System.out.println("The perimeter is :" +perimeter);
            System.out.println("The area is greater than perimeter");
        }if(perimeter > area){
            System.out.println("The perimeter is " + perimeter);
            System.out.println("The area is :" +area);
            
            System.out.println("The perimeter is greater than area");
        }
        

    }
}
