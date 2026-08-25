import java.util.Scanner;
public class switchcase4 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in); 
     System.out.println("enter a letter"); 
     char i=sc.next().charAt(0);
     switch(i){
 case 'a':
     case 'e':
         case 'i':
             case 'o':
                 case 'u':
    System.out.println("this is a vowel");
    break;
  default :
  System.out.println("this is a consonant");
        }
    }
}
