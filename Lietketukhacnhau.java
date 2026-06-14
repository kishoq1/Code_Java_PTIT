/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodePTIT;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Kisho
 */
public class Lietketukhacnhau {
    public static class WordSet {
    private SortedSet<String> ts;

    public WordSet(String s) throws IOException {
        Scanner in = new Scanner(new File(s));
        SortedSet<String> ts = new TreeSet<>();
        while (in.hasNext())
            ts.add(in.next().toLowerCase());
        this.ts = ts;
    }

    @Override
    public String toString() {
        String ans = "";
        for (String s : ts)
            ans += s + "\n";
        return ans;
    }
}

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    public static void main6605832(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
    public static void main4322604(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
    }
}
