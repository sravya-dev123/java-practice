public class datatypes {

    public static void main(String[] args) {
        int Num = 5;               // Integer (whole number)
float FloatNum = 5.99f;    // Floating point number
char Letter = 'D';         // Character
boolean Bool = true;       // Boolean
String Text = "Hello";     //nrml text

/*datatypes are two types:
they are:
Primitive data types - includes byte, short, int, long, float, double, boolean and char
Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
*/


System.out.println("int datatype:"+Num);
System.out.println("float datatype:"+FloatNum);
System.out.println("char datatype:"+Letter);
System.out.println("boolean datatype:"+Bool);
System.out.println("string datatype:"+Text);
/*Primitive Data Types
A primitive data type specifies the type of a variable and the kind of values it can hold.

There are eight primitive data types in Java:

Data Type	Description
byte	Stores whole numbers from -128 to 127
short	Stores whole numbers from -32,768 to 32,767
int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
boolean	Stores true or false values
char	Stores a single character/letter or ASCII values
*/
    }
}