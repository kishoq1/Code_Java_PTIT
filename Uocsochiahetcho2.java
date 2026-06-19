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
import java.lang.Math;
public class Uocsochiahetcho2 {
    static void solution (int n) {
        int count = 0;
        double sqrt = Math.sqrt(n);
        for (int i = 1; i < sqrt; i++) {
            if (n % i == 0) {
                if (i % 2 == 0)     ++count;
                if ((n/i) % 2 == 0) ++count;
            }
        }
        if (sqrt == (int)sqrt && sqrt % 2 == 0) ++count; 
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            solution(n);
            
        }
        input.close();
    }
}
