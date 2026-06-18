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
class Teacher {
    private String code, name, position;
    private int basicSalary, base, totalSalary, allowance;
    
    public Teacher() {
        Scanner sc = new Scanner(System.in);
        this.code = sc.nextLine();
        this.name = sc.nextLine();
        this.basicSalary = sc.nextInt();
        this.position = code.substring(0, 2);
        this.base = Integer.valueOf(code.substring(2));
        if (position.equals("HT"))  allowance = 2000000;
        else if (position.equals("HP")) allowance = 900000;
        else    allowance = 500000;
    }
    public Integer getTotalSalary () {
        return basicSalary * base + allowance;
    }
    @Override
    public String toString() {
        return code + " " + name + " " + base + " " + allowance + " " + getTotalSalary();
    }
}
public class Tinhthunhapgiaovien {
    public static void main(String[] args) throws NumberFormatException {
        Teacher tc = new Teacher();
        System.out.println(tc);
    }
}
