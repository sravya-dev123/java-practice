public class printvariables {
    public static void main(String[] args) {
        //type one
        String name="sravya";
        System.out.println("hello"+name);
    //type 2

String firstName = "sravya ";
String lastName = "sangadi";
String fullName = firstName + lastName;
System.out.println(fullName);

/*In Java, the + symbol has two meanings:

For text (strings), it joins them together (called concatenation).
For numbers, it adds values together.
For numeric values, the + character works as a mathematical operator (notice that we use int (integer) variables here):*/

int x=4;
int y=3;
System.out.println(x+y);
//output is 7

//mixing text with numbers
int num=9;
int num1=030;
System.out.println("this sum and multiply is:"+ num+num1);//this i an multiple formate o/p:924
System.out.println("this is sum :"+(num+num1));// this is addition formatte o/p:33

    }
}
