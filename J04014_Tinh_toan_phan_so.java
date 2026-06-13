/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Kisho
 */
class Fraction {
    Long tuSo, mauSo;

    public Fraction(Long tuSo, Long mauSo) {
        Long gcd = BigInteger.valueOf(tuSo).gcd(BigInteger.valueOf(mauSo)).longValue();
        this.tuSo = tuSo / gcd;
        this.mauSo = mauSo / gcd;
    }

    public Fraction add (Fraction b) {
        return new Fraction(tuSo * b.mauSo  + b.tuSo* mauSo , mauSo  * b.mauSo );
    }

    public Fraction multiply (Fraction b) {
        return new Fraction(tuSo * b.tuSo, mauSo  * b.mauSo );
    }
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    
}
public class J04014_Tinh_toan_phan_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Fraction a = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction b = new Fraction(sc.nextLong(), sc.nextLong());
            Fraction tmp = a.add(b);
            // c = (a+b)^2
            Fraction c = tmp.multiply(tmp);
            // d = a*b*c
            Fraction d = a.multiply(b).multiply(c);
            
            System.out.println(c + " " + d);
        }
    }
}
