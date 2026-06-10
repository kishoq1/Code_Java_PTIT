/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Kisho
 */
public class Daycontangdan {
    static int n, a[];
    static ArrayList<Integer> arr = new ArrayList<>();
    static ArrayList<String> res = new ArrayList<>();

    static void Try(int i, int pre) {
        if (i == n) {
            if (arr.size() > 1) {
                String tmp = "";
                for (int j = 0; j < arr.size(); j++) tmp += arr.get(j) + " ";
                res.add(tmp);
            }
            return;
        }
        if (a[i] >= pre) {
            arr.add(a[i]);
            Try(i + 1, a[i]);
            arr.remove(arr.size() - 1);
        }
        Try(i + 1, pre);
    }

    public static void main(String[] args) throws Exception {
        File file = new File("DAYSO.in");
        Scanner sc = new Scanner(file);
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Try(0, Integer.MIN_VALUE);
        Collections.sort(res);
        for (String s : res)
            System.out.println(s);
    }
}
