package th.ac.nu.student.u54341642.compro.ch03;
import java.util.Scanner;
public class Homework3_7 {
    public  static  void  main(String[]args){
          
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Frequency(Hz):");
        double input = in.nextDouble();
        if(input<(3*Math.pow(10, 9))){
            System.out.println("Radio Waves");
        }
        if(input<(3*Math.pow(10, 11))&&input>(3*Math.pow(10, 9))){
            System.out.println("Microwaves");
        }
        if(input<(4*Math.pow(10, 14))&&input>(3*Math.pow(10, 11))){
            System.out.println("Infrared");
        }
        if(input<(7.5*Math.pow(10, 14))&&input>(4*Math.pow(10, 14))){
            System.out.println("Visible Light");
        }
        if(input<(3*Math.pow(10, 16))&&input>(7.5*Math.pow(10, 14))){
            System.out.println("Ultraviolet");
        }
        if(input<(3*Math.pow(10, 19))&&input>(3*Math.pow(10, 16))){
            System.out.println("X-rays");
        }
        if(input>(Math.pow(10, 19))){
            System.out.println("Gamma Rays");
        }
    }
}