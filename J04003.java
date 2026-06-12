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

public class J04003 {
    
    static long gcd (long a, long b) {
        if (b == 0) return a;
        else    return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhanSo a = new PhanSo();
        a.setTu(input.nextLong());
        a.setMau(input.nextLong());
        long ucln = gcd (a.getTu(), a.getMau());
        System.out.println((a.getTu() / ucln) + "/" + (a.getMau()/ucln));
    }
}
class PhanSo {
    private long tu, mau;
    public void setTu (Long tu) {
        this.tu = tu;
    }
    public void setMau (Long mau) {
        this.mau = mau;
    }
    public long getTu () {
        return this.tu;
    }
    public long getMau () {
        return this.mau;
    }
}
