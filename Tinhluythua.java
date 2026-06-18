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
public class Tinhluythua {
     static final long mod = (long)(1e9+7);
    static long divide (long a, long b) {
        if (b == 0) return 1;
        if (b == 1) return a;
        long tmp = divide(a, b/2) % mod;
        if (b%2 == 0)   return (tmp * tmp) % mod;
        else    return ((tmp * tmp) % mod * a) % mod;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a, b;
        while (true) {
            a = input.nextLong();
            b = input.nextLong();
            if (a == 0 && b == 0)   return;
            System.out.println(divide(a, b));
        }
    }
}
