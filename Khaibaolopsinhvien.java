/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 *
 * @author Kisho
 */
class Student1{
    String id, name, cls, dob;
    float gpa;
    

    public Student1(String id, String name, String cls, String dob, float gpa) throws ParseException{
        this.id = id;
        this.name = name;
        this.cls = cls;
        this.gpa = gpa;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        this.dob = sdf.format(sdf.parse(dob));
    }

    @Override
    public String toString() {
        return id + " " + name + " " + cls + " " + dob + " " + String.format("%.2f", gpa);
    }
}
public class Khaibaolopsinhvien {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String cls = input.next();
        String dob = input.next();
        float gpa = input.nextFloat();
        Student1 st = new Student1("B20DCCN001", name, cls, dob, gpa);
        System.out.println(st);
    }
}
