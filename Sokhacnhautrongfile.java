/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Kisho
 */
public class Sokhacnhautrongfile {
    public static void main(String[] args) throws FileNotFoundException {
        String file = "DATA.in";
        Scanner sc = new Scanner(new FileInputStream(file));
        int m[] = new int[1000];
        Arrays.fill(m, 0);
        try {
            while(sc.hasNext()) {
                try {
                    m[Integer.parseInt(sc.next())]++;
                } catch(Exception e) {}
            }
        } catch (Exception e){
            sc.close();
        }
        for (int i = 0; i < 1000; i++)
            if(m[i] != 0) {
                System.out.println(i + " " + m[i]);
            }
    }
}
