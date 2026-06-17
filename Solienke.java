/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.util.Scanner;
/**
 *
 * @author Kisho
 */
public class Solienke {
    static Scanner input = new Scanner(System.in);
    static void test_case () {
        char[] n = input.nextLine().toCharArray();
        for (int i = 1; i < n.length; i++) {
            if (Math.abs(n[i] - n[i-1]) != 1) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
    public static void main(String[] args) {
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) 
            test_case();
    }
}
