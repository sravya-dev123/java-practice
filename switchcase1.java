
import java.util.Scanner;
public class switchcase1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an number");
     int i= sc.nextInt();
switch (i % 2) {
    case 0:
        System.out.println("even number");
        break;
         case 1:
        System.out.println("odd number");
        break;
         case 2:
        System.out.println("even number");
        break;

    default:
        
        System.out.println("invalid number");
        
        break;
}

        
    }
}
