/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

/**
 *
 * @author Kisho
 */
import java.util.Scanner;

public class Songuyento {
    static Scanner input = new Scanner(System.in);
    static boolean nto (long n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    static void test_case () {
        long n = input.nextLong();
        System.out.println(nto(n) ? "YES" : "NO");
    }
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-- > 0)
            test_case();
    }
    
}
