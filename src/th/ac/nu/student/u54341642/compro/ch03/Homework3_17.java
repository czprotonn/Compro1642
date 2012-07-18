package th.ac.nu.student.u54341642.compro.ch03;
import java.util.Scanner;
public class Homework3_17 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Plese enter your income :");
        double income = in.nextDouble();
        if(income <= 50000){
            System.out.println("Tax = "+income*0.01);
            }else{
        if((income > 50000)&&(income <= 75000)){
            System.out.println("Tax = "+income*0.02);
            }else{
        if((income > 75000)&&(income <= 100000)){  
            System.out.println("Tax = "+income*0.03);
            }else{
        if((income > 100000)&&(income <= 250000)){  
            System.out.println("Tax = "+income*0.04);
            }else{
        if((income > 250000)&&(income <= 500000)){  
            System.out.println("Tax = "+income*0.05);
            }else{
        if(income > 500000){  
            System.out.print("Tax = "+income*0.06);
        }}}}}}}}