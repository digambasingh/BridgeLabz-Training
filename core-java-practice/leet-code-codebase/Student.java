import java.util.Scanner;
public class Student
{
public static void main(String[] args)
{
// this is a program to check the given String is palindrome or not 
Scanner sc = new Scanner(System.in);
System.out.print("Enter the String: ");
String str = sc.nextLine();
int strLen = str.length()-1;
int first = 0;
if(str.length()==0){
System.out.println("string must be a one character!");
}
while(first<=strLen){
 if(str.charAt(first)!= str.charAt(strLen)){
  System.out.println("String is not Palindrome!");
return;
}
 first++;
 strLen--;
 }
System.out.println("String is Palindrome!");


 }
}