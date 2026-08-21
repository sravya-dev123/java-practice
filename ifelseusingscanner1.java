import java.util.Scanner;

public class ifelseusingscanner1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int i=sc.nextInt();
        if(i<0){
            System.out.println("this is a odd number");
        }
        else{
            System.out.println("this is a even number");
        }
    }
}
