/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kisho
 */
class NhanVien {
    private String id, name, gender, dob, address, taxId, signDate;

    public NhanVien() {
    }

    public NhanVien(String id, String name, String gender, String dob, String address, String taxId, String signDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.taxId = taxId;
        this.signDate = signDate;
    }

    @Override
    public String toString() {
        return  id + " " + name + " " + gender+ " " + dob + " " + address + " " + taxId + " " + signDate;
    }
}
public class J04007_Khaibaolopnhanvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<NhanVien> nv = new ArrayList<>();
        for (int i = 0; i < t; i++) 
            nv.add(new NhanVien(String.format("%05d", i+1), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        for(NhanVien i : nv)
            System.out.println(i);
        
    }
}
