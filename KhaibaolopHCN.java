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
class Rectange {
    int width, height;
    String color;

    public Rectange() {
    }

    public Rectange(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public String getColor() {  // int -> string: troi lenh
        return color.substring(1, 2).toUpperCase()+color.substring(2).toLowerCase();
    }

    public int findArea () {
        return this.height * this.width;
    }

    public int findPerimeter () {
        return (this.height + this.width) * 2;
    }

    @Override
    public String toString() {
        if (height <= 0 || width <= 0)  return "INVALID";
        else
            return findPerimeter() + " " + findArea() + " " + getColor();
    }
    
}
public class KhaibaolopHCN {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Rectange hcn = new Rectange(input.nextInt(), input.nextInt(), input.nextLine());
        System.out.println(hcn);
    }
}
