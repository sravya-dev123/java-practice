public class variables {
    //Variables are containers for storing data values.
    public static void main(String[] args) {
        System.out.println("variables");
        /* 
        In Java, there are different types of variables, for example:

String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
*/

/*
Declaring (Creating) Variables
To create a variable in Java, you need to:

Choose a type (like int or String)
Give the variable a name (like x, age, or name)
Optionally assign it a value using =
 */
// basic sytan = datatype variablename= value;
String name="sravya";
System.out.println("name:"+name);
System.out.println("or");
// or
System.out.println(name);

//using int
int number=2010;
System.out.println("birth year:"+number);
System.out.println("or");
// or
System.out.println(number);

// different types of print statements

int num;
num=23;
System.out.println(num);

//types of variable declaraion
int mNum = 5;
System.out.println(mNum);
float myFloatNum = 5.99f;
System.out.println(myFloatNum);
char myLetter = 'D';
System.out.println(myLetter);
boolean myBool = true;
System.out.println(myBool);
String myText = "Hello";
System.out.println(myText);
    }
}
