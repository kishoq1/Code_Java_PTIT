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
class student{
    static float tong = 0f;
    private String name;
            String birthDay;
            float a,b,c;
    public float tongdiem(){
        return a+b+c;
    }
    public student(String name, String birthDay, float a, float b, float c){
        this.name = name;
        this.birthDay = birthDay;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String toString(){
        return name + " " + birthDay;
    }
}
public class Khaibaolopthisinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student st= new student(sc.nextLine(),sc.nextLine(),sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        System.out.println(st+" "+st.tongdiem());
    }
}
