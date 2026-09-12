public class varkeyword {
    public static void main(String[] args) {
        //VAR KEYWORD

        /*
Share



Link Copied
The var Keyword
The var keyword was introduced in Java 10 (released in 2018).

The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.

This helps you write cleaner code and avoid repeating types, especially for long or complex types.

For example, instead of writing int x = 5;, you can write:*/

var x=200; //here x is an integer
var y=3.7f; //here y is an float
var z=2.99; //here z is an double
var a='A';  //here A is an character
var b=true; //here b is an boolean
var c="sravya"; //here c is an string


System.out.println("integer:"+x);

System.out.println("float:"+y);

System.out.println("double:"+z);

System.out.println(" character:"+a);

System.out.println(" boolean:"+b);

System.out.println("string:"+c);

System.out.println("these are the var keyword types");



/*
Important Notes
1. var only works when you assign a value at the same time (you can't declare var x; without assigning a value):

var x; // Error
var x = 5;  // OK
2. Once the type is chosen, it stays the same. See example below:

var x = 5;  // x is now an int
x = 10;     // OK - still an int
x = 9.99;   // Error - can't assign a double to an int


*/
    }
    
}
