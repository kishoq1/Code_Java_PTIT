/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;   
/**
 *
 * @author Kisho
 */
class SV {
    private String id;
    private String name;
    private String gr;
    private String birth;
    private float gpa;

    public SV() {
    }

    public SV(String id, String name, String gr, String birth, float gpa) {
        this.id = id;
        this.name = name;
        this.gr = gr;
        String[] birthDay = birth.split("/");
        this.birth = String.format("%02d", Integer.parseInt(birthDay[0])) + "/" + String.format("%02d", Integer.parseInt(birthDay[1])) + "/" + birthDay[2];
        DecimalFormat df = new DecimalFormat("#.00");
        this.gpa = gpa;
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        return this.id + " " + this.name + " " + this.gr + " " + this.birth + " " + df.format(this.gpa);
    }
}

class SVs {
    List<SV> list;

    public SVs() {
        list = new ArrayList<>();
    }
}
public class Danhsachsvtrongfile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in"));
        SVs s = new SVs();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++)
            s.list.add(new SV("B20DCCN" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine())));
        s.list.forEach(System.out::println);
    }
}
