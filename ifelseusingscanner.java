
import java.util.Scanner;
public class ifelseusingscanner {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
  System.out.println("enter a number:");
  int i= Sc.nextInt();
        if(i<0){
            System.out.println("the number is negative");
        }
        else{
            System.out.println("the number is positive");
        }
    }
}
