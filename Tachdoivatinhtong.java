/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;
import java.math.BigInteger;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 *
 * @author Kisho
 */
public class Tachdoivatinhtong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        String n = sc.next();
        while (n.length() > 1) {
            int index = (int)(n.length()/2);
            n = (new BigInteger(n.substring(0, index)).add(new BigInteger(n.substring(index)))).toString();
            System.out.println(n);
        }
        sc.close();
    }
}
