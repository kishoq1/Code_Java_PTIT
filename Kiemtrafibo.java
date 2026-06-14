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
public class Kiemtrafibo {
    static Scanner input = new Scanner(System.in); 
    static boolean check (long n) {
        long i1=0,i2=1,i3=0;
        if(n==0)    return true;
        while(n>i3){
            i3 = i1+i2;
            if(n==i3)   return true;
            i1=i2;
            i2=i3;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int t = input.nextInt();
        while (t-- > 0){
            long n = input.nextLong();
            System.out.println(check(n) ? "YES" : "NO");
        }
        input.close();
    }
}
