import java.util.Scanner;

public class ifelseusigscanner3
{
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter a day");
        String day=Sc.nextLine();
        if(day.equals("monday") ||
        day.equals("tuesday")||
        day.equals("webday") ||
        day.equals("thursday")||
        day.equals("friday")){
            System.out.println("uff,it's a weekday");
        }
        else if(day.equals("sunday") ||
        day.equals("saturday")){
        System.out.println("yayy,it's a weekend");
    }
    else
    {
        System.out.println("invalid day");
     }
       }
         }


