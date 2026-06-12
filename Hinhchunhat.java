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
public class Hinhchunhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println( a <= 0 || b <= 0 ? 0 : ((a + b) * 2 + " " + a * b));
        input.close();
    }
}
