
package th.ac.nu.student.u54341642.compro.ch03;

import java.util.Scanner;

public class Homework3_2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Temperature:");
        int temp = in.nextInt();
        
        System.out.println("Enter C for Celsius or F for Fahrenheit:");
        String tempLetter = in.next();
        
        System.out.println("Enter Altitude(in meter):");
        int altitude = in.nextInt();
        
        double dropBoil = altitude / 300.0;
        if(tempLetter.equals("c")){
            if(temp>=100-dropBoil){
                System.out.println("Gaseous");
            }else{
                if(temp<=0){
                    System.out.println("Solid");
                }else{
                    System.out.println("Liquid");
                }
            }
        }else{
            if(temp>=212 - dropBoil){
                System.out.println("Gaseous");
            }else{
                if(temp<=32){
                    System.out.println("Solid");
                }else{
                    System.out.println("Liquid");
                }
            }
        }
    }
}
