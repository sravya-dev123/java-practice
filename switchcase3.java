
import java.util.Scanner;
public class switchcase3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int i=sc.nextInt();
       switch(Integer.signum(i)){
case 1:
    System.out.println("positive");
    break;

    case -1:
        System.out.println("negative");
        break;
        
        case 0:
            System.out.println("zero");
            break;
            
            default:
                System.out.println("invailid number");
                break;

        }
      

    }
}
