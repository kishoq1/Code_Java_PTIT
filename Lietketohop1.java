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
public class Lietketohop1 {
    static int n, k, a[], cou = 0;
    static public void combination (int i) {
        for (int j = a[i-1] + 1; j <= n-k+i; j++) {
            a[i] = j;
            if (i == k) {
                for (int l = 1; l <= k; l++)
                    System.out.print(a[l] + " ");
                System.out.println();
                cou++;
            }
            else 
                combination(i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[k + 5];
        combination(1);
        System.out.printf("Tong cong co %d to hop\n", cou);
        
    }
}
