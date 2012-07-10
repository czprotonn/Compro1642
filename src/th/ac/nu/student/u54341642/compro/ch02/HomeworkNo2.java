/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341642.compro.ch02;
import java.util.Scanner; 
public class HomeworkNo2 {
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter First Number :");
     int number1 = in.nextInt();
     System.out.print("Enter Second Number :");
     int number2 = in.nextInt();
     System.out.println("Sum is "+(number1+number2));
     System.out.println("Different is "+(number1-number2));
     System.out.println("Product is "+(number1*number2));
     System.out.println("Average is "+((number1+number2)/2.0));
     System.out.println("Distance is "+(Math.abs(number1-number2)));
     System.out.println("Maximum is "+(Math.max(number1,number2)));
     System.out.println("Minimum is "+(Math.min(number1,number2)));
 }
 }