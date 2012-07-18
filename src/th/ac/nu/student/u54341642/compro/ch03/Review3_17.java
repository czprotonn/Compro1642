
package th.ac.nu.student.u54341642.compro.ch03;
import java.util.Scanner ;
public class Review3_17 {

    public static void main(String[] args) {
 Scanner in = new Scanner (System.in);
 System.out.print("Enter GPA : ");

        double GPA = in.nextDouble();
if (GPA >= 1.5 ){
if(GPA < 2 ){
System.out.println("Try a little bit ! You are on probation.  o.,O ");
}
}else{
System.out.println("Sorry, You failed ! ");
}
    }
}
