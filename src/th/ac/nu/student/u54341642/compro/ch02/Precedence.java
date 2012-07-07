/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.student.u54341642.compro.ch02;
public class Precedence {
    public static void main(String[] args) {
        System.out.println(1 + 2 * 3);    // 7
        System.out.println((1 + 2) * 3);  // 9
        System.out.println(1 + (2 * 3));  // 7 
    }
}