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
public class Sochinhphuong {
    static boolean check (int n) {
        int x = (int)(Math.sqrt(n));
        return x*x == n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            System.out.println(check(n) ? "YES" : "NO");
        }
        input.close();
    }
}
