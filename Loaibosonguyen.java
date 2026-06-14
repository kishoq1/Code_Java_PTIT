/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Kisho
 */
public class Loaibosonguyen {
    static boolean isNotInt(String s) {
        try {
            Integer.parseInt(s);
            return false;
        } catch (NumberFormatException e) {
            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while (in.hasNext()) {
            String s = in.next();
            if (isNotInt(s)) a.add(s);
        }
        Collections.sort(a);
        for (String s : a) System.out.print(s + " ");
    }
}
