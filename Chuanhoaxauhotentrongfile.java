/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Kisho
 */
public class Chuanhoaxauhotentrongfile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (true) {
            String name = sc.nextLine();
            if (name.equals("END"))
                break;
            String[] list = name.trim().split("\\s+");
            for (int i = 0; i < list.length; i++)
                list[i] = list[i].substring(0, 1).toUpperCase() + list[i].substring(1, list[i].length()).toLowerCase();
            System.out.println(String.join(" ", list));
        }
    }
}
