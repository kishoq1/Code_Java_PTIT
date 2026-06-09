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
public class Chiatamgiac {
    static Scanner input = new Scanner(System.in);
    static void test_case () {
        int n = input.nextInt();
        double h = input.nextDouble();
        for (int i = 1; i < n; i++) 
            System.out.format("%.6f ", h*Math.sqrt((double)i/n));
        System.out.println();
    }
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-- > 0)
            test_case();
    }
}
