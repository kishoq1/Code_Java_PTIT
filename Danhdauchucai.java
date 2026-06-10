
package CodePTIT;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Kisho
 */
public class Danhdauchucai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] s = input.next().toLowerCase().toCharArray();
        Set<Character> hs = new HashSet<>();
        for (char c : s) 
            hs.add(c);
        System.out.println(hs.size());
    }
}
