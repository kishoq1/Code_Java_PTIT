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
public class Tichmatranvoimatranchuyenvicuano {
    static Scanner sc = new Scanner(System.in);
    static int n, m;

    static int[][] multiply(int[][] a) {
        int[][] c = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                c[i][k] = 0;
                for (int j = 0; j < m; j++) {
                    c[i][k] += a[i][j] * a[k][j];
                }
            }
        }
        return c;
    }

    static void printMatrix(int[][] c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }

    static void test_case(int t) {
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        System.out.printf("Test %d:\n", t);
        printMatrix(multiply(a));
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            test_case(i);
        }
    }
}
