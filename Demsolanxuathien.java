/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Arrays;
import java.util.Scanner;

public class Demsolanxuathien {
    static Scanner input = new Scanner(System.in);
    static void test_case(int j) {
        int n = input.nextInt();
        int[] a = new int[n];
        int[] mark = new int[(int)(1e5 + 5)];
        Arrays.fill(mark, 0);
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
            mark[a[i]]++;
        }
        System.out.println("Test " + j + ":");
        for (int i = 0; i < n; i++) {
            if (mark[a[i]] != 0) {
                System.out.println(a[i] + " xuat hien " + mark[a[i]] + " lan");
                mark[a[i]] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int t = input.nextInt();
        for (int i = 1; i <= t; i++) {
            test_case(i);
        }
         
    }
}
