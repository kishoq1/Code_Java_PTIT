/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author Kisho
 */
public class Student {
    //thuoc tinh
    private String code;
    private String name;
    //private boolean gender;
    private int birthYear;
    private String address;
    //ham tao

    public Student() {
    }

    public Student(String code, String name, int birthYear, String address) {
        this.code = code;
        this.name = name;
        this.birthYear = birthYear;
        this.address = address;
    }
    //getter and setter

    Student(String nextLine, String nextLine0, double parseDouble, double parseDouble0, double parseDouble1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Student(String nextLine, String nextLine0, double parseDouble, double parseDouble0, double parseDouble1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCode() {
        if(getAge()>23)
          return code.toUpperCase()+1;
        else
           return code.toUpperCase(); 
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public boolean isGender() {
//        return gender;
//    }
//
//    public void setGender(boolean gender) {
//        this.gender = gender;
//    }
    //nhap
    private boolean isCode(String code){
        String re="^B\\d{2}[A-Za-z]{4}\\d{3}$";
        return code.matches(re);
    }
    private boolean isYear(String y){
        String re="\\d{4}+";
        return y.matches(re);
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.print("code:");//ma sinh vien
        code=sc.next().toUpperCase();
        if(isCode(code)){
            break;
        }
            System.err.println("input again!!!");
        }
        sc.nextLine();//enter
        System.out.print("name:");
        name=sc.nextLine();
        while(true){
           System.out.print("birth of year:");
           String y=sc.nextLine();
           //birthYear=sc.nextInt();
           if(isYear(y)){
               birthYear=Integer.parseInt(y);
               break;
           }
            System.err.println("input again!!");
        }
        //sc.nextLine();
        System.out.print("address:");
        address=sc.nextLine();
    }
    //tuoi
    public int getAge(){
        Calendar c=Calendar.getInstance();//tra nam hien thoi
        int y=c.get(Calendar.YEAR);
        return (y-birthYear);//tuoi
    }
    @Override
    public String toString(){
        return getCode()+"\t"+name+"\t"+
                birthYear+"\t"+address;
    }
}
