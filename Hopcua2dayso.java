/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Kisho
 */
public class Hopcua2dayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] mark = new boolean[1005];
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n + m; i++) {
            a.add(sc.nextInt());
            mark[a.get(i)] = true;
        }
        Collections.sort(a);
        a.forEach(val -> {
            if (mark[val] == true) {
                System.out.print(val + " ");
                mark[val] = false;
            }
        });
    }
}
