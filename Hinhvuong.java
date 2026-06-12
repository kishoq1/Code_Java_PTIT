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
public class Hinhvuong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i = 0; i < 4; i++) {
            x[i] = input.nextInt();
            y[i] = input.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        int edge = Math.max(x[3] - x[0], y[3] - y[0]);
        System.out.println(edge*edge);
       
    }
}
