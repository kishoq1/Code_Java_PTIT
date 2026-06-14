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
public class Phantichthuasonguyento {
    static Scanner input = new Scanner(System.in);
    static void solution (long n) {
        int i = 2, cou = 0;
        while (n >= i) {
            while (n % i == 0) {
                n /= i;
                ++cou; 
            }
            if (cou > 0) {
                System.out.print(i + "(" + cou + ") ");
                cou = 0;
            }    
            ++i;
        }
    }
    static void testcase (int t) {
        long n = input.nextLong();
        System.out.print("Test " + t + ": ");
        solution(n);
        System.out.println();
    }
    public static void main(String[] args) {
        int t = input.nextInt();
        for (int i = 1; i <= t; i++)
            testcase(i);
    }           
}
