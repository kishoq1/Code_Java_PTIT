/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Kisho
 */
public class Giaocua2dayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] mark = new boolean[1005];
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            mark[a[i]] = true;
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        for (int i = 0; i < m; i++) 
            if (mark[b[i]] == true) {
                System.out.print(b[i] + " ");
                mark[b[i]] = false;
            }
        System.out.println();
        
    }
}
