/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

/**
 *
 * @author Kisho
 */
import java.util.Scanner;

public class Chuso4vachuso7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] n = input.nextLine().toCharArray();
        int count = 0;
        for (char i:n) 
            if (i == '4' || i == '7')   count++;
        System.out.println(count == 4 || count == 7 ? "YES" : "NO");
        input.close();
    }
}
