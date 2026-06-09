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
public class Chuanhoaxauhoten2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] s = sc.nextLine().trim().split("\\s+");
            for (int i = 1; i < s.length; i++)
                s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase();
            System.out.println(String.join(" ", Arrays.copyOfRange(s, 1, s.length)) + ", " + s[0].toUpperCase());
        }
    }
}
