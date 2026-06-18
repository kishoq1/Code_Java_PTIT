/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Kisho
 */
public class Thugondayso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        Stack<Integer> s=new Stack<>();
        s.push(a[0]);
        int i=1;
        while(i<n){
            if(s.size()>0){
                int tmp=s.peek();
                if((tmp+a[i])%2==0){
                    s.pop();
                }
                else{
                    s.push(a[i]);
                }
            }
            else{
                s.push(a[i]);
            }
            i++;
        }
        System.out.println(s.size());
        
    }
}
