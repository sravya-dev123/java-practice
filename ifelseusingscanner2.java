import java.util.Scanner;
public class ifelseusingscanner2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("enter the marks:");
            int marks=sc.nextInt();
            if(marks<35){
                System.out.println("he/she is fail");
            }
             else if(marks>=35 && marks<=70){
                System.out.println("he/she is second class");
              }else{
                System.out.println("he/she is pass");
            }
          }
        }
    }
