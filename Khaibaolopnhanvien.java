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
class NhanVien {
    String id, name, gender, dob, address, taxId, signDate;
    
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
        return id + " " + name + " " + gender+ " " + dob + " " + address + " " + taxId + " " + signDate;
    }
}
public class Khaibaolopnhanvien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien("00001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        System.out.println(nv);
        sc.close();
    }
}
