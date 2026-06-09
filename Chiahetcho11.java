/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.math.BigInteger;
import java.util.Scanner;
/**
 *
 * @author Kisho
 */
public class Chiahetcho11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println(sc.nextBigInteger().mod(BigInteger.valueOf(11)) == BigInteger.valueOf(0) ? 1 : 0);
        }
    }
}
