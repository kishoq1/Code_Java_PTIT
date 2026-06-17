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
public class Souuthe {
    static boolean isValid (String n) {
        int odd = 0, even = 0;
        for (String i : n.split("")) {
            if (i.matches("[02468]"))   even++;
            else    odd++;
        } 
        return (n.length() % 2 == 0 && even > odd) || (n.length() % 2 == 1 && odd > even);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            String s = input.next();
            if (s.matches("^0.*") || !s.matches("\\d+"))
                System.out.println("INVALID");
            else
                System.out.println(isValid(s) ? "YES" : "NO");
        }
    }
}
