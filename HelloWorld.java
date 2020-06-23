import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World...jk khawar");
//use variable string 
String name ="Khawar Javed";
String Channel ="Geo news";
System.out.println(name);
System.out.println(name +  " from " + Channel);
//use variable int , float and blooean type declared 
int a = 50;
float b = 47.99f;
boolean isAdult = false;
System.out.println(a);
System.out.println(b);
System.out.println(isAdult);
/*
Rules of constracting name of variables in java.
1.Can contain digits,underscore,doller sign,letters.
2.Should begin with a letter,$ or _
3.Java is case sensitive language which means that khawar and Khawar 
are two diffirent variables altogether.
4.Should not contain whitespaces.
5.You cannot use resevred keywords from java.
*/
/*Two types of Data Types.
1.Primitive byte(1 byte)short(2 bytes)int(4 bytes)long (8bytes)float(4bytes)
double(8bytes)boolean(1 bit)char (2 bytes)
2.Non Primitive or Reference Data type.
*/
byte u = 65;
double d = 45.86865676d;
System.out.println(u);
System.out.println(d);
char grade = 'A';
System.out.println(grade);

/* Operators in java
Operand operator Operand = Result
4           +        4   =  8
Types of operators in java
Arthimatic operators
Assignment operators
Logical    operators
Comparsion operators
*/
//Arthimatic operator
int num1 = 55 ,num2 = 65;
//Assignment opertaor
 num1 += 10;
System.out.println("the value of num1 + num2 is:");
System.out.println(num1+num2);
System.out.println("the value of num1 - num2 is:");
System.out.println(num1-num2);
System.out.println("the value of num1 * num2 is:");
System.out.println(num1*num2);
System.out.println("the value of num1 / num2 is:");
System.out.println(num1/num2);
System.out.print("the value of num1 % num2 is:");
System.out.println(num1%num2);

System.out.println(num1++);
System.out.println(++num1);
System.out.println(num1--);
System.out.println(--num1);
/*
Comparison Operators
1. == :Checks of equality of two values.
2. != :checks if two values are not equal.
3. <
4. >
5. <=
6. >=

Logical operators
1. &&
2. ||
3.  !
*/ 
//Taking user input java
Scanner scan = new Scanner(System.in);
System.out.println("Enter input");
String input = scan.nextLine();
System.out.println(input);

    }
}