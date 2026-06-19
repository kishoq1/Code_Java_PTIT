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
public class Tongphanso {
    static long gcd (long a, long b) {
        if (b == 0) return a;
        else    return gcd(b, a%b);
    }
    static void solution (PhanSo a, PhanSo b) {
        PhanSo res = new PhanSo();
        res.setTu(a.getTu()*b.getMau() + a.getMau()*b.getTu());
        res.setMau(a.getMau()*b.getMau());
        long ucln = gcd(res.getTu(), res.getMau());
        System.out.println((res.getTu()/ucln) + "/" + (res.getMau()/ucln));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhanSo a = new PhanSo();
        PhanSo b = new PhanSo();
        a.setTu(input.nextLong());
        a.setMau(input.nextLong());
        b.setTu(input.nextLong());
        b.setMau(input.nextLong());
        solution(a, b);
    }
}
