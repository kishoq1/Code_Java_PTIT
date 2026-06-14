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
public class Matrannhiphan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), res = 0;
        int[][] a = new int[n+1][4];
        for (int i = 1; i <= n; i++) 
            for (int j = 1; j <= 3; j++)
                a[i][j] = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int zero = 0, one = 0;
            for (int j = 1; j <= 3; j++) {
                if (a[i][j] == 0)   zero++;
                else    one++;
            }
            if (one > zero) ++res;
        }
        System.out.println(res);
    }
}
