/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.util.Scanner;

/**
 *
 * @author NguyenVanDuc
 */
class Staff {
    String id, name, position;
    Integer basicSalary, dailySalary, workDays, allowance, bonus;

    public Staff(String name, Integer dailySalary, Integer workDays, String position) {
        this.id = "NV01";
        this.name = name;
        this.dailySalary = dailySalary;
        this.workDays = workDays;
        this.position = position;
        if (position.equals("GD"))  allowance = 250000;
        else if (position.equals("PGD"))    allowance = 200000;
        else if (position.equals("TP"))    allowance = 180000;
        else if (position.equals("NV")) allowance = 150000;
        basicSalary = dailySalary * workDays;
        if (workDays >= 25) bonus = (int)(basicSalary * 0.2);
        else if (workDays >= 22)    bonus = (int)(basicSalary * 0.1);
        else bonus = 0;
    }
    public Integer getTotalSalary () {
        return basicSalary + bonus + allowance;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + basicSalary + " " + bonus + " " + allowance + " " + getTotalSalary();
    }

}
public class Baitoantinhcong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Staff nv = new Staff(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next());
        System.out.println(nv);
        sc.close();
    }
}
