import java.util.Scanner;


public class HelloWorld {
    //method calling
    //static int sum (int a,int b){
       // return a+b;
   // }
    public static void main(String[] args) {
        System.out.println("Hello World...jk khawar");
//use variable string 
/*String name ="Khawar Javed";
String Channel ="Geo news";
System.out.println(name);
System.out.println(name +  " from " + Channel);
System.out.println(name.contains("Khawar"));
*/
//use variable int , float and blooean type declared 
/*int a = 50;
float b = 47.99f;
boolean isAdult = false;
System.out.println(a);
System.out.println(b);
System.out.println(isAdult);*/
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
/*byte u = 65;
double d = 45.86865676d;
System.out.println(u);
System.out.println(d);
char grade = 'A';
System.out.println(grade);*/

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
/*int num1 = 55 ,num2 = 65;
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
/*Scanner scan = new Scanner(System.in);
System.out.println("Enter your age");
int age = scan.nextInt();*/
//System.out.println(input);
 
//if else conditional
 /*if(age>20) 
{
    System.out.println("you are an adult");
}
else if(age>5){
    System.out.println("you are not a kid");
}
else{
    System.out.println("you are  a kid");
}*/
// switch statement in java
/*switch(age){
    case 20:
    System.out.println("you are 20 year old");
    break;
    case 30:
    System.out.println("you are 30 year old");
    break;
    case 45:
    System.out.println("you are 45 year old");
    break;
    default:
    System.out.println("you did not match any cases");
    /*
}//while loop
/*int i = 0;
while(i<50){
    System.out.println(i);
    i += 1;
}*/
//for loop
/*for (int k=0;k<10;k++){
    System.out.println(k);
}//java array
int [] marks = {1,40,23,12,43};
marks [4] = 50;// this will update marks
System.out.println(marks[3]);
System.out.println(marks[4]);
//for each loop
System.out.println("this is for each loop");
for(int value:marks){
    System.out.println(value);
}//string array
String [] cars = {"honda","suzuki","yamaha","carola"};
for(String value:cars){
    System.out.println(value);
    }
    //try catch
   /* String [] car = {"honda","suzuki","yamaha","carola"};
try{
    System.out.println(cars[3]);
}catch(Exception e){
    System.out.println(e);

}
System.out.println("masoom");*/
//System.out.println(sum( 6,8));
/*float number_1, number_2;
System.out.println("Enter first number");
Scanner scan = new Scanner(System.in);
number_1 = scan.nextFloat();
System.out.println("Enter second3 number");
//Scanner scan2 = new Scanner(System.in);
number_2 = scan.nextFloat();
System.out.print("you have entered");
System.out.print(number_1);
System.out.print("and");
System.out.println(number_2);
String prompt = "Enter 0 for addition, 1 for subtraction, 2 for multiplication, and 3 for division";
System.out.println(prompt);
int input = scan.nextInt();
switch(input){
    case 0:
    System.out.println("Adding these number");
    System.out.print("The result is:");
    System.out.println(number_1 + number_2);
    break;
    case 1:
    System.out.println("subtraction these number");
    System.out.print("The result is:");
    System.out.println(number_1 - number_2);
    break;
    case 2:
    System.out.println("multiplication these number");
    System.out.print("The result is:");
    System.out.println(number_1 * number_2);
    break;
    case 3:
    System.out.println("division these number");
    System.out.print("The result is:");
    System.out.println(number_1 / number_2);
    break;
    default:
    System.out.println("invalid input");*/
    

 {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}
}

//}