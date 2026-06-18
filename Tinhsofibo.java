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
public class Tinhsofibo {
    static Scanner input = new Scanner(System.in);
    static long[] fibo = new long[95];
    static void Init () {
        for (int i = 3; i <= 92; i++)   fibo[i] = 0; 
        fibo[1] = fibo[2] = 1;
        for (int i = 3; i <= 92; i++) 
            fibo[i] = fibo[i-1] + fibo[i-2];
    }
    
    public static void main(String[] args) {
        Init(); 
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            System.out.println(fibo[n]);
        }
            
        //input.close();    
    }
}
