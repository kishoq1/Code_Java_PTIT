/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class BoisochungUocsochung {
    static Scanner input = new Scanner(System.in);
    static long __gcd (long a, long b) {
        if (b == 0) return a;
        else return __gcd(b, a%b);
    }
    static void test_case () {
        long a = input.nextLong();
        long b = input.nextLong();
        long ucln = __gcd(a, b);
        System.out.println((a / ucln * b) + " " + ucln);
    }
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-- > 0)
            test_case();
    }
}
