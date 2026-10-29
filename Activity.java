/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity;

/**
 *
 * @author Admin
 */
public class Activity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = classifyTriangle(3, 3, 3);

        System.out.println(number);

    }

    // Problem No. 1
    static int EvenorOdd(int number) {

        if (number % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    // Problem No. 2
    static int classifyTriangle(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            return 0;
        }
        if (a == b && b == c) {
            return 1;
        }
        if (a == b || a == c || b == c) {
            return 2;
        }
        return 3;
    }
}
