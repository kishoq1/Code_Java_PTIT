/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Kisho
 */
 
public class Danhsachmonhocfile {

    /**
     * @param args the command line arguments
     */
    public static class MonHoc implements Comparable<MonHoc>{
    private String ma, ten;
    private int tinChi;

    public MonHoc(String ma, String ten, int tinChi) {
        this.ma = ma;
        this.ten = ten;
        this.tinChi = tinChi;
    }

    @Override
    public int compareTo(MonHoc m) {
        if (this.ten.compareTo(m.ten) > 0) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + tinChi;
    }
}


    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(in.nextLine());
        ArrayList<MonHoc> a = new ArrayList<>();
        while (t-- > 0) {
            a.add(new MonHoc(in.nextLine(), in.nextLine(), Integer.parseInt(in.nextLine())));
        }
        Collections.sort(a);
        for (MonHoc m : a)
            System.out.println(m);
    }
}
