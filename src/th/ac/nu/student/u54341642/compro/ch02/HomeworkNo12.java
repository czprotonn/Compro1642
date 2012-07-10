/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341642.compro.ch02;
import java.util.Scanner; 
public class HomeworkNo12 {
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter The number of galllon of gas in tank :");
     int tank = in.nextInt();
     System.out.println("Enter The fuel efficiency in mile per gallon :");
     int mile = in.nextInt();
     System.out.println("Enter The price of gas per gallon :");
     int price = in.nextInt();
     System.out.println("The cost per 100 miles is "+((100.0/mile)*price));
     System.out.println("This car can go "+(tank*mile));
     
 }
 }