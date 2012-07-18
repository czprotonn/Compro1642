package th.ac.nu.student.u54341642.compro.ch03;
import java.util.Scanner;

public class Homework3_12{
public static void main(String args[]){
Scanner in = new Scanner(System.in);

        System.out.println("Enter day and month(ddmm):");
        int input = in.nextInt();

        int d = input / 100;
        int m = input % 100;
        String season = "";
        if (m == 1 || m == 2 || m == 3) {
            season = "Winter";
        }
        if (m == 4 || m == 5 || m == 6) {
            season = "Spring";
        }
        if (m == 7 || m == 8 || m == 9) {
            season = "Summer";
        }
        if (m == 10 || m == 11 || m == 12) {
            season = "Fall";
        }
        if (m % 3 == 0 && d >= 21) {
            if (season.equals("Winter")) {
                season = "Spring";
            } else {
                if (season.equals("Spring")) {
                    season = "Summer";
                } else {
                    if (season.equals("Summer")) {
                        season = "Fall";
                    } else {

                        season = "Winter";
                    }
                }
            }

        }
        System.out.println(season);
    }
}