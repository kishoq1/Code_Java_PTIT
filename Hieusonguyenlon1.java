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
public class Hieusonguyenlon1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            BigInteger a = input.nextBigInteger();
            BigInteger b = input.nextBigInteger();
            int length = Math.max(a.toString().length(), b.toString().length());
            System.out.println(String.format("%" + length + "s", a.subtract(b).abs().toString()).replace(' ', '0'));
        }
    }
}
