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
public class Sodep2 {
    static boolean sum(StringBuilder s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum % 10 == 0;
    }
    static boolean check(StringBuilder s){
        if(s.charAt(0)!= '8'){
            return false;
        }
        if(s.charAt(s.length()-1)!= '8'){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            StringBuilder s = new StringBuilder(sc.nextLine());
            if(sum(s)&&check(s)&& s == s.reverse()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
