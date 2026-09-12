public class primitivedatatypes {
   public static void main(String[] args) {
    /*
    Integer Types
Byte
The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
    */
byte byte1=120;
System.out.println(byte1);

/*short
The short data type can store whole numbers from -32768 to 32767:
*/
short short1 = 5000;
System.out.println(short1);

/*int
The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
*/

int Num = 100000;
System.out.println(Num);

/*Long
The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":
*/
long myNum = 15000000000L;
System.out.println(myNum);
   } 
}
