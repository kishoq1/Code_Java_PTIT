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
public class Xaudoixung {
    static boolean isReversible (String s) {
        int n = s.length();
        int diff = 0;
        for (int i = 0; i < n/2; i++)
            if (s.charAt(i) != s.charAt(n - 1 - i))
                diff++;
        return (diff == 1 && n % 2 == 0) || (diff <= 1 && n % 2 == 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            System.out.println(isReversible(s) ? "YES" : "NO");
        }
        input.close();
    }
}
