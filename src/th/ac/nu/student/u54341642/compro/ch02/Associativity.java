/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341642.compro.ch02;
public class Associativity {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 1;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
        System.out.println(32 % 7 % 3);    // 1
        System.out.println((32 % 7) % 3);  // 1 
        System.out.println(32 % (7 % 3));  // 0
    }
}