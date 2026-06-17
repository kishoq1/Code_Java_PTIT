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
public class Sotamphan {
    static boolean check (char[] s) {
        for (char i:s) 
            if (i > '2')   return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            char s[] = input.nextLine().toCharArray();
            System.out.println(check(s) ? "YES" : "NO");
        }
        input.close();
    }
}
