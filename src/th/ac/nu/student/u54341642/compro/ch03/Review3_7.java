
package th.ac.nu.student.u54341642.compro.ch03;
import java.util.Scanner ;
public class Review3_7 {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
System.out.print("Enter Letter: ");
String letter = in.nextLine();
System.out.print("Enter Number: ");
int number = in.nextInt();


if ((letter.equalsIgnoreCase("a")) ||
(letter.equalsIgnoreCase("c")) ||
(letter.equalsIgnoreCase("e"))||
(letter.equalsIgnoreCase("g"))){

if (number%2.0 != 0){
System.out.println("color = Black");
}else{
System.out.println("color = White");
}
}else{
if (number%2.0 == 0){
System.out.println("color = Black");
}else{
System.out.println("color = White");
}

}
}
}