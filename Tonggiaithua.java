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
public class Tonggiaithua {
    static Scanner input = new Scanner(System.in);   
    public static void main(String[] args) {
        int n = input.nextInt();
        long res = 0, m = 1;
        for (int i = 1; i <= n; i++) {
            m *= i;
            res += m;
        }
        System.out.println(res);
    }
}
