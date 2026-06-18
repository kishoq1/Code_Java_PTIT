/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
/**
 *
 * @author Kisho
 */
public class Tapturiengcua2xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            HashSet<String> set1 = new HashSet<>(Arrays.asList(sc.nextLine().split(" ")));
            HashSet<String> set2 = new HashSet<>(Arrays.asList(sc.nextLine().split(" ")));
            for (String i : set1)
                if (!set2.contains(i))
                    System.out.print(i + " ");
            System.out.println();
        }
    }
}
